package ex05_BankAccount;

public class BankAccount {

String acc;
private Bank bank;
private long balance;

public BankAccount(Bank bank,String acc,long balance)
{
	this.bank=bank;
	this.acc=acc;
	this.balance=balance;
	
	}
	public BankAccount(long balance) {
	this.balance=balance;
}
	public void info()
	{
		System.out.println("계좌번호:"+acc+", 통장잔액:"+balance+"원");
		bank.info();
	}
  
}
