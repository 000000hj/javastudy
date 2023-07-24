package ex02_Computer;

public class Notebook extends Computer {

  private int battery;
  private String model;
  //Notebook 생성자의 super(model);에 의해서 호출되는 생성자
 
  
  public Notebook(String model ,int battery)
  {
    super();
    this.model=model;
    this.battery=battery;
  }
  
  public String getModel()
  {
     return model;
  }
  
  public void setModel(String model)
  {
    this.model=model;
  }
  
  public int getBattery()
  {
    return battery;
  }
  
  public void setBattery(int battery)
  {
   this.battery=battery; 
  }
  
  
  
}
