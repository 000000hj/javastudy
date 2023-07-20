package ex07_constructor;

public class MainWrapper {

  public static void main(String[] args) {
    //Computer myCom 객체 선언
    Computer myCom;
    
    //Computer myCom객체 생성
    myCom=new Computer();//public(){} 생성자가 호출된다
    
    
    
  //Computer yourCom 객체 선언
    Computer yourCom;
    
    //Computer yourCom객체 생성
    yourCom=new Computer("macBook");//public Computer(String model){}생성자가 호출된다
    
    myCom.setModel("gram");
    System.out.println("myCom :"+ myCom.getModel());
    
   
    System.out.println("yourCom :"+yourCom.getModel());
    

  }

}
