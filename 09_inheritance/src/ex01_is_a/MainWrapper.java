package ex01_is_a;

public class MainWrapper {

  public static void main(String[] args) {
   //Student 객체 선언
    Student s = new Student();
    
    // Student 객체 메소드 확인
    s.eat();      //슈퍼클래스로 부터 상속 받은 메소드
    s.sleep();    // 슈퍼클래스로부터 상속 받은 메소드
    s.study();    //본인것

  }

}
