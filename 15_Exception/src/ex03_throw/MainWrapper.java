package ex03_throw;

import java.util.Scanner;

public class MainWrapper {

  public static void main(String[] args) {

    /*
     * throw 
     * 1. 예외 객체를 직접 생성(new)해서 던질 때 사용한다.
     * 2. Java는 예외로 판단하지 않는 것들을 던질 때 사용한다.
     * 3. 개발자가 직접 예외를 처리할 때 사용한다.
     * 
     */
    Scanner sc=null;
   
   
    try {
   
    sc=new Scanner(System.in);
    System.out.println("나이를 입력하시오");
    int age=sc.nextInt();
    if(age<0||age>100) {throw new RuntimeException();}//직접 RuntimeException을 발생시켜서 던진다.
        System.out.println((age>19)? "주류 구매 가능":"주류 구매 불가능");
        
    }
    catch(Exception e){
     System.out.println("숫자를 입력하시오");
     
    }finally {
      
      sc.close();
    
  }

  }
  }
