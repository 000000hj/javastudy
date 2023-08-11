package naver.api;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

public class NaverApiSearchBook {
  
  public Scanner sc=new Scanner(System.in);
  
  private void generateImage(String spec) {
    
    URL url = null;
    HttpURLConnection con = null;
    BufferedInputStream bin = null;
    BufferedOutputStream bout = null;
    
    try {
      
      // 파라미터 String spec에는 다운로드 받을 이미지 파일의 URL이 전달된다.
      // 해당 URL의 이미지 파일을 다운로드 받는다.
      
      url = new URL(spec);
      
    
      // HttpURLConnection 객체 생성
      con = (HttpURLConnection) url.openConnection();
      
      // 입력스트림 생성
      bin = new BufferedInputStream(con.getInputStream());

      // 출력할 파일 File 객체
      File dir = new File("C:/download");
      if(dir.exists() == false) {
        dir.mkdirs();
      }
     
       
      String fileName = spec.substring(spec.lastIndexOf("/") + 1);
      File file = new File(dir, fileName);
      
      // 출력스트림 생성
      bout = new BufferedOutputStream(new FileOutputStream(file));
      
      // 읽은 데이터를 저장할 바이트 배열
      byte[] b = new byte[1024];  // 1KB씩 읽기
      
      // 실제로 읽은 바이트 수
      int readByte = 0;
      
      // 읽기 (다음 로고 이미지를 byte[] b에 저장하기)     
      // 쓰기 (byte[] b의 내용을 daum.png 파일로 보내기)
      while((readByte = bin.read(b)) != -1) {
        bout.write(b, 0, readByte);
      }
      
      // 확인 메시지
      System.out.println(file.getPath() + " 파일 다운로드 완료");
      
      
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if(bout != null) bout.close();
        if(bin != null) bin.close();
        if(con != null) con.disconnect();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    
  }
  
  public void getSearchList() {
    
    URL url = null;
    HttpURLConnection con = null;
    BufferedReader reader = null;
    
    try {
      
      // 책 검색 OpenAPI를 사용해서 응답 결과 중 이미지(image) 결과만 추출하여
      // generateImage 메소드에 전달한다.
      // 10번의 generateImage 메소드 호출이 필요하다.
    //요청주소 (이건 JSon 형식)
      String spec="https://openapi.naver.com/v1/search/book.json";
      
    //검색
      System.out.print("도서 검색>>>");
      String query=sc.nextLine();
      
    //클라정보
      String clientId="M66ILrIhUx97zQHB93tA";
      String clientsecret="CamLL8HvE0";
      
   // URL 연결
      StringBuilder sbUrl=new StringBuilder();
      sbUrl.append(spec);
      sbUrl.append("?query=").append(URLEncoder.encode(query,"UTF-8"));
      
    //url객체
      url=new URL(sbUrl.toString());
      //접속
      con=(HttpURLConnection)url.openConnection();
      
      //요청메서드 GET
      con.setRequestMethod("GET");
      
      //요청 헤더
      con.setRequestProperty("X-Naver-Client-Id", clientId);
      con.setRequestProperty("X-Naver-Client-Secret", clientsecret);
      
      //오류코드요청
      //정상적 연결 안되면 오류코드 띄움
      int responseCode=con.getResponseCode();
      if(responseCode!=HttpURLConnection.HTTP_OK)
      {
        
        throw new RuntimeException("에러코드:"+responseCode);
      }
      
      //접속한곳의 내용물 읽어들일것
      reader=new BufferedReader(new InputStreamReader(con.getInputStream()));
      //문자열을 저장할 변수
      String line=null;
      //문자열을 연결할 StringBuilder
      StringBuilder sb= new StringBuilder();
      
      
      
      // null을 만날때까지 줄단위로 읽음, sb에 누적.
      while((line=reader.readLine())!=null)
      {
        sb.append(line+"\n");
      }
      
    //obj>item 분석
      JSONObject obj=new JSONObject(sb.toString());
      JSONArray items=obj.getJSONArray("items");
      
      for(int i=0 ,length=items.length();i<length;i++) {
        JSONObject item=items.getJSONObject(i);
        String img=item.getString("image");
        generateImage(img);
      }
      
    } catch (Exception e) {
      
      // 예외 발생 시 로그파일을 만든다.
     
          
      // 예외 발생 시간
      LocalDateTime now = LocalDateTime.now();
      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd a h:mm:ss");
      String time = dtf.format(now);
      // 예외 메시지
      String message = e.getMessage();
      // 예외 클래스
     
      
      File dir = new File("C:/download/log");
      if(dir.exists() == false) {
        dir.mkdirs();
      }
      File file = new File(dir, "log.txt");
      
      
      try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
        
        // 로그 파일에 "시간 예외메시지 예외클래스" 추가하기
        bw.write(time + " , " + message);
        bw.newLine();
      
      
   // 결과 메시지
      System.out.println(file.getPath() + " 파일에 예외 처리 완료");
      }catch (IOException e2) {
        e2.printStackTrace();
      }
      
    } finally {
      try {
        if(reader != null) reader.close();
        if(con != null) con.disconnect();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    
  }
  
}