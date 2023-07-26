package bankAccount_2;

public class BankMember {

  private BankAccount acc;
  private String name;
  
  BankMember(String name,BankAccount acc)
  {
    this.name=name;
    this.acc=acc;
  }
  

  public BankAccount getAcc() {
    return acc;
  }


  public void setAcc(BankAccount acc) {
    this.acc = acc;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public void info() {
    System.out.println("고객명:"+name);
    acc.info();
  }

public void transfer(BankMember member, long money)
{
  
}

public void deposiste()
{
  
}

public void withdrawal() {
  
}
  
  
  
  
  
}
