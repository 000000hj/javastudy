package bankAccount_2;



public class MainWrapper {

  public static void main(String[] args) {
    
    Bank bank=new Bank("우리은행","02-111-1111");
    bank.info();

    // 우리은행(02-111-1111)
    
    System.out.println("-------------------------");
    
    
    BankAccount acc1 = new BankAccount(bank, "012-34-56789", 50000);
    acc1.info();  // 계좌번호: 012-34-56789, 통장잔액: 50000원
                 // 개설지점: 우리은행(02-111-1111)
    
    
    System.out.println("-------------------------");
    
    BankMember member1 = new BankMember("홍길동", acc1);
    member1.info();  // 고객명: 홍길동
                    // 계좌번호: 012-34-56789, 통장잔액: 50000원
                    // 개설지점: 우리은행(02-111-1111)
    
    
    BankAccount acc2 = new BankAccount(bank, "012-34-56789", 1000);
    BankMember member2=new BankMember("고길동",acc2);
   
    
    
    
  //이체
    member2.transfer(member1,100);//2가 1한테 이체한다.
    member1.info();
    member2.info();
    
  }

}
