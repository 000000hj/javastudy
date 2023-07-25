package bankAccount;
// 한번 더해보기
public class BankAccount {

	private String accNo;
	private long money;
	private BankAccount bankAcc;
	
	
	
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public long getMoney() {
		return money;
	}
	public void setMoney(long money) {
		this.money = money;
	}
	public void deposite(long money)
	{
	  if(money<=0)
	  {
	    return;
	  }
	  this.money+=money;
	}
	
	public long withdrawal(long money) {
	  long retVal=0;
	  if(money<=0||money>this.money)retVal=0;
	  else {
	    this.money-=money;
	    retVal=money;
	  }
	 
	  return retVal;
	}
	public void transfer(BankAccount bankAcc,long money)
	{
		long trans=withdrawal(money);
		bankAcc.deposite(trans);
	}
	

	
	public void inquiry()
	{
		System.out.println("계좌번호"+accNo+"잔액:"+this.money+"원");
	}
}
