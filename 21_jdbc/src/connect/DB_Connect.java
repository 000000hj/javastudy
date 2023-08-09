package connect;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DB_Connect {
  
  public static Connection getConnection() {//클래스 메소드 ,new 없이 호출가능 
    
    Connection con =null;
    
    try (BufferedReader reader =new BufferedReader(new FileReader("src/db.properties")))
    {
      Class.forName("oracle.jdbc.OracleDriver");
      
      // 프로퍼티파일 -> 프로퍼티객체
      Properties p =new Properties();
      p.load(reader);
      
      con=DriverManager.getConnection(p.getProperty("url"),p.getProperty("user"),p.getProperty("password"));
      
            
      
    }
    catch (Exception e) {
      
    }      
    
    return con;
      
      
    }

  
    
}
