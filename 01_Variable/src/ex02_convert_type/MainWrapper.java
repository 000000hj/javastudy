package ex02_convert_type;

public class MainWrapper {

  
  public static void main(String[] args) {
    /*
     * 자동변환 (promotion)
     * 1. 작은 크기 -> 큰 크기
     * 2. 정수 -> 실수
     * */
    
    byte num1= 127; //byte는 -123 ~ +127 가능
    int  num2=num1;//1byte 크기를 가진 num1 을 4byte 크기로 변환
    System.out.println(num2);
    
    double addResult=1.5+5;//5를 5.0 으로 자동 변환 
    System.out.println(addResult);
    
    /*
     *강제변환 (casting) 
     * 1. 큰 크기-> 작은 크기
     * 2. 실수 -> 정수
     * 
     * */
    int bigNum =256;
    byte smallNum=(byte)bigNum; //4바이트 bitNUm을 강제로 1바이트로 변환 -> 원본이 훼손 될 수 있다.
    System.out.println(smallNum);
    
    double pct =0.5;
    int ipct=(int)pct; //실수를 강제로 정수로 변환할 때 (소숫점은 잘려나간다.)
    
    
    /*구문 분석(parsing)
     * 1. 문자열 -> 정수(int, long)
     * 2. 문자열 -> 실수(double)
     * */
    
    String strScore ="100";
    int score=Integer.parseInt(strScore);
    System.out.println(strScore );
    
    String strMoney="10000000000";
    long money=Long.parseLong(strMoney);
    System.out.println(money);
    
    String strComm="0.5";
    double comm=Double.parseDouble(strComm);
    System.out.println(comm);
            
    
  }
}
