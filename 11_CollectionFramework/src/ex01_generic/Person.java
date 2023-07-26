package ex01_generic;

public class Person {

  private String name;
  

  
  @Override
  public String toString() {
    return "Person [name=" + name + "]";
  }



  public Person(String name)
  {
    this.name=name;
  }
}
