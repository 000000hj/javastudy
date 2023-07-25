package ex05_upcasting;

public class Person {

  
  private String name;
  
  //new Person()
  public Person() {
    
  }
  
  //new Person("홍길동")
  public Person(String name)
  {
    this.name=name;
  }
  
  public String getName() {
    return name;   
  }
  
  
  public void setName(String name) {
    this.name=name;
  }
  
  public void eat() {
    System.out.println("냠냠");
  }
  
  public void Sleep() {
    System.out.println("쿨쿨");
  }
  
  public void info() {
    System.out.println("이름:"+ name);
  }

  
  //실행이 목적이 아닌 호출이 목적인 메소드
  public void study() {
    
    
  }
  
  //실행이 목적이 아닌 호출이 목적인 메소드
  public void working()
  {
    
  }

  
  

 

}
