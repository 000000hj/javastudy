package ex05_BankAccount;

public class BankMember {

	
	private String name;
	private BankAccount bankAcc;


	
  public BankMember() {
    
  }
	public BankMember(String name,BankAccount bankAcc)
	{
		this.name=name;
		this.bankAcc=bankAcc;
		
	}

  //Setter
	public void setName(String name)
	{
	  this.name=name;
	}
	
	public void setAcc(BankAccount bankAcc)
	{
	  this.bankAcc=bankAcc;
	}
	

	//Getter
	public String getName()
	{
	  return name;
	}
	public BankAccount getAcc()
	{
	  return bankAcc;
	}


	public void deposit(long money) {
	 bankAcc.deposit(money);
	}
	
	public long withdrawal(long money)
	{
	  return bankAcc.withdrawal(money);
	}
	
	 public void transfer(BankMember member,long money)
	  {
	    member.deposit(withdrawal(money));
	  }
	
	
	public void info()
	{
		System.out.println("고객명:"+name);
	 bankAcc.info();
		
	}

 
}
