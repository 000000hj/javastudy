package ex05_BankAccount;

public class Bank {
  
  private String bankName;
  private String callNo;
  
  public Bank(String bankName,String callNo)
  {
    this.bankName=bankName;
    this.callNo=callNo;
  }
  
  


	public void info()
  {
   
    System.out.println(bankName+"("+callNo+")");
    
  }
}
