package ex07_Car;

public class Car {

  private Driver driver;
  private int speed;
  private int fuel;
  private boolean isEmpty;
  
  
  public void setEmpty(boolean isEmpty)//Setter
  {
    this.isEmpty=isEmpty;
  }
  
  public boolean isEmpty()//Getter
  {
    return isEmpty;
  }
}
