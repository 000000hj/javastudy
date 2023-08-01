package ex01_BankAccount;

public class MainWrapper {

  public static void main(String[] args) {
    
    
    try {
    BankAccount acc=new BankAccount(40000,"1234");

    
    
    BankAccount acc2=new BankAccount(5000,"5678");
    acc.transfer(acc2, 10000);
    acc.deposite(90000);
    acc.inquiry();
    acc2.inquiry();
    
    

   
    }
    catch(RuntimeException e) {
      System.out.println(e.getMessage());
    }
    
  }

}
