package ex05_BankAccount;

public class BankMember {

	
	private String name;
	private BankAccount bankAcc;

	

	public BankMember(String name,BankAccount bankAcc)
	{
		this.name=name;
		this.bankAcc=bankAcc;
		
	}

	public void info()
	{
		System.out.println("고객명:"+name);
	 bankAcc.info();
		
	}
 
}
