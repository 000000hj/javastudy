package ex_01_Car;

public class MainWrapper {

  public static void main(String[] args) {
    //Ev
    Ev ev =new Ev();
    ev.drive();
    ev.charge();
    
    //EngineCar
    EngineCar enCar=new EngineCar();
    enCar.drive();
    enCar.addFuel();
    
    //HibridCar
    HybridCar hybrid =new HybridCar();
    hybrid.drive();
    hybrid.addFuel();
    hybrid.charge();
  }

}
