package ex05_BankAccount;

public class Bank {
  
  private String bankName;
  private String callNo;
  
  
 
  
  
  
  public Bank(String bankName,String callNo)
  {
    this.bankName=bankName;
    this.callNo=callNo;
  }
  
<<<<<<< HEAD
  public Bank() {
   
  }

  //Setter
  public void setName(String bankName)
  {
    this.bankName=bankName;
  }
  
  
  public void setTel(String callNo)
  {
    this.callNo=callNo;
  }
  //Getter

  
  public String getName()
  {
    return bankName;
  }
  
  public String getTel()
  {
    return callNo;
  }
=======
  

>>>>>>> f0891ee6e230d064536792a01829589913089aaa

	public void info()
  {
   
    System.out.println(bankName+"("+callNo+")");
    
  }
}
