package ex08_abstract;

public class MainWrapper {

  public static void main(String[] args) {

    //추상클래그 Person은 객체를 생성할 수 없다.
   // Person p1=new Person();
   // p1.eat();
   // p1.sleep();
    Student p2=new Student();
    p2.eat();
    p2.sleep();
    p2.study();
  }

}
