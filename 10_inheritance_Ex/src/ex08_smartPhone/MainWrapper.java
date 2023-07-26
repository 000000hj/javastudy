package ex08_smartPhone;

//인터페이스 다중 구현이 가능하다.
//클래스 상속과 인터페이스 구현을 동시에 할 수 있다.(상속 먼저,구현 나중)
public class MainWrapper {

  public static void main(String[] args) {
   
    Phone p=new SmartPhone();
    p.call();
    p.sms();
    if(p instanceof Camera)
    {
      ((Camera) p).takePicture();
    }
    if(p instanceof Computer) {
      p.call();
      p.sms();
      
    }
    Computer c= new SmartPhone();
    c.game();
    c.internet();
    
    if(c instanceof Camera)
    {
      ((Camera) c).takePicture();
    }
    SmartPhone sp=new SmartPhone();
    if(sp instanceof SmartPhone)
    {
      sp.call();
      sp.sms();
      sp.game();
      sp.internet();
      sp.takePicture();
    }
  }

}
