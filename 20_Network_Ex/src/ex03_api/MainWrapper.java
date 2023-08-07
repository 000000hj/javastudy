package ex03_api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class MainWrapper {

  public static void main(String[] args) {

    //문제. 공공데이터포털 data.go.kr  "한국전력공사_전기차 충전소 운영정보" API를 신청하고 
    //결과를 "C:/storage/한국전력공사_전기차_충전소_운영정보.xml"로 저장하시오.
    
    
    //1.요청주소:http://openapi.kepco.co.kr/service/EvInfoServiceV2
    //2.요청변수:
    //1)serviceKey
    //2)pageNo
    //3)numOfRows
    //4)addr
    
    //URL
    URL url=null;
    //연결
    HttpURLConnection con=null;
    
    //파일 읽기
    BufferedReader br=null;
    //파일 쓰기
    BufferedWriter bw=null;
    
   
  
    
    
    try {
      String spec="http://openapi.kepco.co.kr/service/EvInfoServiceV2/getEvSearchList";
      String serviceKey="RYkVQDI3UmUHt7hohNMxsQmFTWp2CUraDTlKHgxKEjPHPvqCHenyuLBqWn2jOZG9738AStC0NiOWP6cUfEyaLQ==";
      String pageNo="1";
      String numOfRows="10";
      String addr="전라남도 나주시 빛가람동 120";
      
      StringBuilder sb=new StringBuilder();
      sb.append(spec);
      sb.append("?serviceKey=").append(URLEncoder.encode(serviceKey,"UTF-8"));
      sb.append("&pageNO=").append(URLEncoder.encode(pageNo,"UTF-8"));
      sb.append("&numOfRows=").append(URLEncoder.encode(numOfRows,"UTF-8"));
      sb.append("&addr=").append(URLEncoder.encode(addr,"UTF-8"));
      
      //URL로 합체
      url=new URL(sb.toString());
      
      con=(HttpURLConnection)url.openConnection();
      
      int responseCode=con.getResponseCode();
      if(responseCode!=HttpURLConnection.HTTP_OK)
        {
        throw new RuntimeException(responseCode+"발생");
        }
      
      br=new BufferedReader(new InputStreamReader(con.getInputStream()));
      
      StringBuilder sbuf=new StringBuilder();
      String line=null;
      while((line=br.readLine())!=null)
      {
        sbuf.append(line+"\n");
      }
      
      //파일 생성
      File dir =new File("c:/storage");
      if(dir.exists()==false)
      {
        dir.mkdirs();
      }
      File file =new File(dir,"한국전력공사_전기차_충전소_운영정보.xml");
      bw=new BufferedWriter(new FileWriter(file));
      bw.write(sbuf.toString());
      
      
      System.out.println(sbuf.toString());
      System.out.println(file.getPath());
      
      
    }
      
      catch (UnsupportedEncodingException e) {

        System.out.println(e.getMessage());
      }
      
      catch (MalformedURLException e) {
        System.out.println(e.getMessage());
      }
      catch (IOException e) {

        System.out.println(e.getMessage());
      }
      catch (RuntimeException e) {

        System.out.println(e.getMessage());
      }finally {
       try {
         if(bw!=null)bw.close();
         if(br!=null)br.close();
         if(con!=null)con.disconnect();
         
       } catch (IOException e) {
         e.printStackTrace();
       }
    
       
    
  }

  }
}
