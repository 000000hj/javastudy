package eX03_update;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import connect.DB_Connect;
import dto.UserDto;

public class MainWrapper {

  public static void main(String[] args) {
    
    
    Scanner sc= new Scanner(System.in);
    System.out.print("수정할 USER_NO>>>");
    int user_no=sc.nextInt();
    sc.nextLine();
    System.out.print("수정할 USER_NAME>>>");
    String user_name=sc.next();
    sc.close();
    
    
    //USER_DTO 생성
    UserDto user =new UserDto();
    user.setUser_no(user_no);
    user.setUser_name(user_name);
    
    //접속
    Connection con =null;
    
    //prepared 객체 선언
    PreparedStatement ps =null;
    try {
      con=DB_Connect.getConnection();
      
      //쿼리문
      String sql="";
      sql+="UPDATE USER_T";
      sql+=" SET USER_NAME=?";
      sql+=" WHERE USER_NO=?";
      
      ps=con.prepareStatement(sql);
     
      ps.setString(1, user.getUser_name());
      ps.setInt(2,user.getUser_no());
     
      
      int updateResult=ps.executeUpdate();
      
      //결과
      System.out.println(updateResult+"개의 행이 수정되었습니다.");
    }
    catch (Exception e) {
      e.printStackTrace();
      
    }try {
      if(ps!=null)ps.close();
      if(con!=null)con.close();
      
    } catch (Exception e) {

    e.printStackTrace();
    }
    
  }

}
