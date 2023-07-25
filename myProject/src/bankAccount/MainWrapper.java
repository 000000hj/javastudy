package bankAccount;

public class MainWrapper {

	public static void main(String[] args) {
	//객체 선언 ,생성
BankAccount myAcc=new BankAccount();
		
	//계좌번호 객체에 등록하기
		myAcc.setAccNo("123-123-1234-123");

	  //you 객체 선언 생성
		BankAccount yourAcc=new BankAccount();
	//you 객체에 계좌번호 등록하기
		yourAcc.setAccNo("234-456-1234-222");
		
		// you 계좌에 송금하기
		myAcc.deposite(10000);
		myAcc.transfer(yourAcc,1000);
		
		//객체 조회하기
		myAcc.inquiry();
		yourAcc.inquiry();
	}

}
