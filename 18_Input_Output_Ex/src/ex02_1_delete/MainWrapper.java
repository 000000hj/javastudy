package ex02_1_delete;

import java.io.File;
import java.time.LocalDateTime;

public class MainWrapper {

  public static void ex01()
  {
    LocalDateTime localDateTime = LocalDateTime.now();
    int year = localDateTime.getYear();
    
    StringBuilder sb = new StringBuilder();
    sb.append("C:");
    sb.append("/");
    sb.append(year);
    
    File dir = new File(sb.toString());
    
    if(dir.exists())
    {
      
      dir.delete();
      System.out.println(dir.getPath()+"디렉터리 삭제 안되유");
    }
  }
  
  public static void ex02() {
    //C:/storage 디렉토리를 삭제하시오
  }
  
  public static void main(String[] args) {

    File dir=new File("//C:/storage");
    
    for(int i=1;i<6;i++)
    {
      File file=new File("//C:/storage/ex0"+i+".dat");
      
      if(file.exists())
      {
      file.delete();
      System.out.println(file.getPath()+"파일 삭제됨");
      }
    }
    
    if(dir.exists()) {
      dir.delete();
      System.out.println(dir.getPath()+"디렉토리 삭제 성공");
    }
  
   
    
  }

}
