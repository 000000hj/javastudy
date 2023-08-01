package ex02_finally;

import java.util.Scanner;

public class MainWrapper {

  //finally 블록
  //1. try-catch문의 마지막 블록으로 추가할 수 있다. (생략 가능)
  //2. 예외 발생 여부와 상관 없이 "항상 마지막"에 처리된다.
  //
  
  public static void main(String[] args) {
    
    Scanner sc=null;//선언
    //나이를 입력 받아서 "주류 구매 가능","주류 구매 불가능" 출력하기
   
    try {
   
    sc=new Scanner(System.in);//생성
    System.out.println("나이를 입력하시오");
    int age=sc.nextInt();
    
        System.out.println((age>19)? "주류 구매 가능":"주류 구매 불가능");
        
    }
    catch(Exception e){
     System.out.println("숫자를 입력하시오");
     
    }finally {
      
      sc.close();//finally는 주로 자원 반납용으로 사용한다.
    }
  }

}
