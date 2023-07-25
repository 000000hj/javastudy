package ex03_Rectangle;

public class MainWrapper {

  public static void main(String[] args) {
 
    //정사각형 만들기
    Square s1= new Square();
    
   s1.setHeight(5);
    s1.setWidth(5);
    s1.info();
    
    //정사각형 만들기
    Square s2=new Square(6);//너비6,높이6인 정사각형
    s2.info();
    s2.getArea();

  }

}
