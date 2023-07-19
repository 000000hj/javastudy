package ex01_BankAccount;

public class MainWrapper {

  public static void main(String[] args) {
    
    //객체 선언 ,생성
    BankAccount my=new BankAccount();
    
    //계좌번호 객체에 등록하기
   my.setAccNo("123-456-7894-456");
    
    //객체에 입금하기
    my.deposite(50000);
    
    //객체 출금하기
    my.withdrawal(4440);
    //객체 조회하기
    my.inquiry();
    
    
    //you 객체 선언 생성
    BankAccount you=new BankAccount();
    
    //you 객체에 계좌번호 등록하기
    you.setAccNo("02-123-1234");
  }
  

}
