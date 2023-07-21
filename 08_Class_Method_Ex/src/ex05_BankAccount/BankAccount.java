package ex05_BankAccount;

public class BankAccount {

String acc;
private Bank bank;
private long balance;

<<<<<<< HEAD


=======
>>>>>>> f0891ee6e230d064536792a01829589913089aaa
public BankAccount(Bank bank,String acc,long balance)
{
	this.bank=bank;
	this.acc=acc;
	this.balance=balance;
	
	}
	public BankAccount(long balance) {
	this.balance=balance;
}
<<<<<<< HEAD
	
	public BankAccount() {
    
  }
  //Setter
	public void setBank(Bank bank)
	{
	  this.bank=bank;
	}
	
	public void setAccNo(String acc)
	{
	  this.acc=acc;
	}
	
	public void setBalance(long balance)
	{
	  this.balance=balance;
	}
	
	

	
	//Getter
	public Bank getBank()
	{
	  return bank;
	}
	public String getAccNo()
	{
	  return acc;
	}
	
	public long getBalance()
	{
	  return balance;
	  
	}
	
//입금
  public void deposit(long money)
  {
    if(money<=0)
    {
      return;
    }
    balance+=money;
  }
  
  //출금
  public long withdrawal(long money)
  {
    long retVal=0;
    if(money>0&&money<=balance) {
      balance-=money;
      retVal=money;
    }
    
      
      return retVal;
    }
    
  
  
  public void transfer(BankAccount acc,long money)
  {
    
    acc.deposit(withdrawal(money));//출금한 금액 만큼 상대계좌에 입금
    
  }
	
	public void info()
	{
		System.out.println("계좌번호:"+acc+", 통장잔액:"+balance+"원");
    System.out.print("개설지점:");
		bank.info();
	}

  
=======
	public void info()
	{
		System.out.println("계좌번호:"+acc+", 통장잔액:"+balance+"원");
		bank.info();
	}
>>>>>>> f0891ee6e230d064536792a01829589913089aaa
  
}
