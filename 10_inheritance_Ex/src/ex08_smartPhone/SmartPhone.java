package ex08_smartPhone;

public class SmartPhone  extends Camera implements Computer,Phone {

  @Override
  public void call() {
   
    System.out.println("전화");

  }

  @Override
  public void sms() {
   System.out.println("문자");

  }

  @Override
  public void game() {
    System.out.println("게임");
  }

  @Override
  public void internet() {
   System.out.println("인터넷");

  }
  
  public void takePicture() {
    System.out.println("사진찍기");
  }

}
