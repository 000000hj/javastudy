package ex09_Eatable;

public class MainWrapper {
public static void main(String [] args) {
  
  Person p1=new Person();
  
  p1.eatEverything(new AppleMango("애플망고"));//애플망고 먹는다.
  p1.eatEverything(new Gosu("고수"));//고수 먹는다.
  
  p1.eatEverything(new AppleMango("애플망고"));//애플망고 먹는다.
  p1.eatPossible(new Gosu("고수"));//컴파일 오류 발생
}
}
