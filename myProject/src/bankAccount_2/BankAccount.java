package bankAccount_2;

public class BankAccount {

  private String acc; //계좌번호
  private Bank bank;  //은행
  private long balance;//잔액
  
  
  //생성
  public BankAccount(Bank bname,String acc,long money )
  {
    bank=bname;
    this.acc=acc;
    balance=money;
  }
  
  //게터세터
  public String getAcc() {
    return acc;
  }
  public void setAcc(String acc) {
    this.acc = acc;
  }
  public Bank getBank() {
    return bank;
  }
  public void setBank(Bank bank) {
    this.bank = bank;
  }
  public long getBalance() {
    return balance;
  }
  public void setBalance(long balance) {
    this.balance = balance;
  }
  
 //메소드
  
  public void transfer(BankAccount acc,long money)
  {
    acc.deposite(withdrawal(money));
  }
  
  public long withdrawal(long money)
  {
    long retVal=0;
    if(money>0&&money<=balance) {
      balance-=money;
      retVal=money;
    }
    
    return money;
  }
  
  public void deposite(long money) {
    
    if(money<=0) {
      return;
    }
    
    balance+=money;
  }
  
  public void info()
  {
    System.out.println("계좌번호:"+acc+", 통장잔액:"+balance+"원");
    System.out.print("개설지점:");bank.info();
  }
  
  
  
  
}
