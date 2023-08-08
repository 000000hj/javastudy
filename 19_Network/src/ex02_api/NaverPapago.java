package ex02_api;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

import org.json.JSONObject;

public class NaverPapago {

//POST
  public static void main(String[] args) {
    
    URL url= null;
    HttpsURLConnection con=null;
    BufferedOutputStream bout=null;//서버로 POST 데이터 보내는 용도
    BufferedReader reader=null;//번역결과를 텍스트로 읽으니까
    try {
      
      //입력받아
      Scanner sc=new Scanner(System.in);
      System.out.println("번역할 한국어 입력>>>");
      String text=sc.nextLine();
      
      //필요한 데이터 초기화
      String spec ="https://openapi.naver.com/v1/papago/n2mt";
       String clientId = "RTJMyHb54a63lvLzPh7A";
       String clientSecret = "0xR9yv0oo3";
      
       //보안이 필요할 때 포스트 방식을 쓴다 .
       String params ="source=ko&target=en&text="+text;//원본은 한국 번역은 영어
       
       url =new URL(spec);
       con=(HttpsURLConnection)url.openConnection();//서버
       
       //요청메소드 POST (생략할 수 없다)
       con.setRequestMethod("POST");
       
       //요청 헤더 (clientId,clientSecret)
       con.setRequestProperty("X-Naver-Client-Id", clientId);
       con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
      
       
       //OutputStream을 이용해서 POST 데이터를 보내겠다 //보낸다는 output(출력)
       con.setDoOutput(true);
       
       //OutputStream 을 이용해서 POST 데이터 보내기(서버로 보내는거야)
       bout=new BufferedOutputStream(con.getOutputStream());//byte[]
       bout.write(params.getBytes());
       bout.flush();//스트림 안에있는 데이터를 확실하게 밀어 보낼때 사용하는것.(빨대로 부는것 생각하기)
                     //write 할 때 그냥 flush()는 항상 붙이자
       ////여기까지가 서버로 데이터를 보내는 것 (요청)
       
       
       //예외처리
       int responseCode=con.getResponseCode();
       if(responseCode!=HttpsURLConnection.HTTP_OK) {
         throw new RuntimeException(responseCode+"발생");
       }
       
       //데이터 읽어들이기
       reader=new BufferedReader(new InputStreamReader(con.getInputStream()));
       StringBuilder sb =new StringBuilder();
       String line =null;
      
       while((line=reader.readLine())!=null)
       {
         sb.append(line);
       }
       
       
      ////////이제 응답하자
       JSONObject obj=new JSONObject(sb.toString());
       //하나씩 꺼내장
       JSONObject message=obj.getJSONObject("message");//obj에서 키값이 message인 오브젝트 꺼내기
       JSONObject result=message.getJSONObject("result");//message에서 키값이 result인 오브젝트 꺼내기
       String translatedText=result.getString("translatedText");
       
       System.out.println("번역결과");
       System.out.println("-----------");
       System.out.println(translatedText);
       
       
       
    }catch (Exception e) {
      System.out.println(e.getMessage());
    }finally {
      try {
        if(reader!=null)reader.close();
        if(bout!=null)bout.close();
        if(con!=null)con.disconnect();
        
        
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    
    
    
    
    
  }

}
