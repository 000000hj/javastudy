package ex07_Car;

public class MainWrapper {
//메소드도 호출을 원하지 않으면 private 로 호출을 막을 수 있다.
  
  public static void main(String []args) {
    
    Driver driver=new Driver();//default 생성자
    Car myCar=new Car();
  
    driver.setName("홍길동");
    driver.setCareer(20);
     myCar.setFuel(50);
     myCar.setDriver(driver);
     myCar.setSpeed(10);
     myCar.setDir(1,-1);
     myCar.engineStart();//시동이 걸렸습니다, 시동이 걸리지 않았습니다.
    myCar.hasMove();//자동차가 움직였습니다. 자동차가 움직이지 않았습니다.
    myCar.accel(50);
    myCar.accel(60);
    myCar.brake(10);
    myCar.brake(60);
    
 
    
  }
}
