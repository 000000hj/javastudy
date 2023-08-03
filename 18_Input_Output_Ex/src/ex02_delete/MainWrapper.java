package ex02_delete;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainWrapper {

  public static void main(String[] args) {
    
    Date date=new Date();
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd/HH");
    
    System.out.println();
    File dir= new File("C:/"+sdf.format(date));

    if(dir.exists())
    {
      dir.delete();
      System.out.println("삭제완료");
    }
  }

}
