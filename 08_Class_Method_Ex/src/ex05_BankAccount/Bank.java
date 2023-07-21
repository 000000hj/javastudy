package ex05_BankAccount;

public class Bank {
  
  private String bankName;
  private String callNo;
  
  
 
  
  
  
  public Bank(String bankName,String callNo)
  {
    this.bankName=bankName;
    this.callNo=callNo;
  }
  
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

	public void info()
  {
   
    System.out.println(bankName+"("+callNo+")");
    
  }
}
