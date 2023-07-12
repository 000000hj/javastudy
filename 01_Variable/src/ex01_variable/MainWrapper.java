package ex01_variable;

public class MainWrapper {
              
  public static void main(String[]args) {
  
    //single comments 한줄주석
    
    /*
    multiple comment 여러줄 주석
     */
    
    /*
     * 키워드 규칙
     * 1.프로젝트 : 맘대로
     * 2.패키지   : 모두 소문자로 작성 (실무는 회사 도메인을 거꾸로 작성, 예 :com.samsung.xxx)  (클래스를 구분하기 위해 패키지를 작성한다.)
     * 3.클래스   : Upper Camel Case(첫글자 대문자인 카멜 케이스)
     * 4.메소드   : Lower Camel Case(첫글자 소문자인 카멜 케이스)
     * 5.변수     : Lower Camel Case
     * 6.상수     : Snake Case(대문자를 밑줄로 연결)
     * */
    
    
    //들여쓰기는 필수이다. 코드가 개발자의 얼굴이다.
    
    //변수 선언하기
    //변수를 선언할때 의미 전달이 중요,변수 이름을 잘 지어야 함.
    
    //primitive type - 1 : 논리타입
    boolean isGood =true;
    boolean isAlive= false;
    System.out.println(isGood);
    System.out.println(isAlive);
   
    
    //primitive type - 2 : 문자타입
    char ch1 ='A';
    char ch2 ='가';
    System.out.println(ch1);
    System.out.println(ch2);
    
    //primitive type - 3: 정수타입
    int score = 100;
    long money=10000000000L;
    System.out.println(score);
    System.out.println(money);
    
    
    //primitive type - 4: 실수타입
    double commission =0.5;
    System.out.println(commission);
    
    
    
    //상수
    final double PI =3.141592;
    System.out.println(PI);
    
    //reference type   : 참조타입
    String name ="tom";  //변수name 에는 tom 의 주소값이 저장되어 있다
    System.out.println(name);
  }
  
  
  
  

  
  
 
}
