package ex07_Car;

public class Car {

  private Driver driver;
  private int speed;
  private int fuel;
  private int hDir;
  private int vDir;
  private final int MAX_SPEED=100;
  private int force;
  
  
  public void setDriver(Driver driver) {
    
    this.driver=driver;
  }
  
  public void setFuel(int fuel)
  {
    this.fuel=fuel;
    
    
  }
  
  public void setSpeed(int speed) {
    
    this.speed=speed;
  }
  
  
  
  
  
  public int getSpeed()
  {
    return speed;
    
    
  }
  
  public void setDir(int horizontal ,int vertical)
  {
    hDir=horizontal;
    vDir=vertical;
  }
 
  
  public void carInfo()
  {
    
    System.out.println(speed+"의 속도로");
    if(hDir>0)
    {
      System.out.print("오른쪽 ");
    }
    if(hDir<0)
    {
      System.out.print("왼쪽 ");
    }
     
    
    
    if(vDir>0)
    {
      System.out.print("앞쪽");
    }
    if(vDir<0)
    {
      System.out.print("뒤");
    }
    System.out.println(" 방향으로 이동했습니다.");
    
    System.out.println("남은연료:"+fuel);
    
  }
  
 
  
  
  public Driver getDriver()
  {
    return driver;
  }
  public int getFuel()
  {
    return fuel;
  }
  public void engineStart() {
    //연료가 있는가?
    if(fuel<=0)
    {
      System.out.println("시동이 걸리지 않았습니다.");
      
      
    }
    else
    System.out.println("시동이 걸렸습니다.");
    
  }
  
  
  public void hasMove()
  {
    if(fuel==0||driver==null||speed==0) {
      System.out.println("자동차가 움직이지 않았습니다.");
      
    }
      
      else {
        System.out.println("자동차가 움직였습니다.");
        carInfo();
      }
    
  }
  
  
  public void accel(int speed)
  {
    
    this.speed+=speed;
    this.speed =(this.speed>MAX_SPEED)?MAX_SPEED:this.speed;
    
    
    System.out.println("가속:"+speed+"현재속도는:"+this.speed+"입니다");
    fuel--;
  }
  
  public void brake(int force)
  {
    if(speed-force<=0)
    {
      speed=0;
      System.out.println("현재속도는 0입니다.");
    }
    else {
      speed-=force;
      System.out.println("현재속도는"+speed+"입니다");
    }
  }
}
