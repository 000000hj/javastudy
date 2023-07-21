package ex07_Car;

public class Driver {

  private String name;
  private int career;
  private boolean bestDriver;
  
  public void setName(String name)
  {
    this.name=name;
  }
  public void setCareer(int career) {
    this.career=career;
  }
  public void setBestDriver(boolean bestDriver) {
  this.bestDriver=bestDriver;
   
  }
  
  
  public String getName()
  {
      return name;
  }
  public int getCareer() {
    return career;
  }
  public boolean isBestDriver() { //불린타입은 getter를 명명할때 is로 시작
  return bestDriver;
   
  }
  
}
