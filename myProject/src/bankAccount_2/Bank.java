package bankAccount_2;

public class Bank {

  private String bname;
  private String call;
  
  
  public Bank()
  {}
  
  public Bank(String bname,String call) {
    this.bname=bname;
    this.call=call;
  }
  
  public void info() {
    System.out.println(bname+"("+call+")");
  }

  public String getBname() {
    return bname;
  }

  public void setBname(String bname) {
    this.bname = bname;
  }

  public String getCall() {
    return call;
  }

  public void setCall(String call) {
    this.call = call;
  }
  
  
  
}
