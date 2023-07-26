package ex10_Walkable;

public class MainWrapper {

  public static void main(String[] args) {
    
   Dog dog=new Dog("개똥이");
   Snake snake=new Snake("날름");
   Person p=new Person();
   
   p.foodFeed(dog,"고구마");
   p.foodFeed(snake,"감자");
   
   p.walk(dog);
  // p.walk(snake);
  }

}
