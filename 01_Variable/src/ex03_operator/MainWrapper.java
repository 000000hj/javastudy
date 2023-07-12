package ex03_operator;

public class MainWrapper {
  //ex01메소드 정의
  public static void ex01() {
    
    //정수연산
   int a=5;
   int b=2;
   
   
   int add= a+b;
   int sub=a-b;
   int mul=a*b;
   int mok=a/b;
   int mod=a%b;
   System.out.println(add);
   System.out.println(sub);
   System.out.println(mul);
   System.out.println(mok);
   System.out.println(mod);

   //실수연산
   double x=5;
   double y=2;
   
   double addResult=x+y;
   double subResult=x-y;
   double mulResult=x*y;
   double divResult=x/y;
   double modResult=x%y;
   
   
   
   System.out.println(addResult);
   System.out.println(subResult);
   System.out.println(mulResult);
   System.out.println(divResult); //나누기
   System.out.println(modResult);
   
    
  //m.정수끼리 계산해서 실수연산 도출하기
   int i=5;
   int j=2;
   double result=(double)5/(double)2;
   double result2=(double)5/2;
   double result3=5/(double)2;
   
   System.out.println(result);
   System.out.println(result2);
   System.out.println(result3);//하나만 double로 바꿔도 나머지는 다 double로 바뀜
   
  }
  
  //ex02메소드 정의
  public static void ex02() {

    
    //증감 연산(++, --)
    
    
    //전위 연산(선증가 후처리)
    
    int a=10;
    System.out.println("a :"+ ++a);//a를 증가시킨 후 출력
    System.out.println("a :"+ a);
    
    //후위 연산(선처리 후증가)
    int b=10;
    System.out.println("b :" + b++); //b를 출력 후 증가 
    System.out.println("b :" + b);
    
  }
 
  //ex03메소드 정의
  public static void ex03() {
    
    //대입연산
    int a=10;
    int b= a;
    System.out.println(a);
    System.out.println(b);
    
    //복합 연산 (복합 대입 연산)
    int x=10;
    int y=1;
    y+=x;//y = y + x ; y값을 x만큼 늘리기
    
    System.out.println(x);
    System.out.println(y);
  } 
  
  //ex04메소드 정의
  public static void ex04() {
    
  //관계연산
    int a=3;
    int b=5;
    
    boolean result1=(a>b); //a 가 b 보다 크면 true, 아니면 false
    boolean result2=(a>=b);//a 가 b 보다 크거나 같으면 true, 아니면 false
    boolean result3=(a<b); //a 가 b 보다 작으면 true, 아니면 false
    boolean result4=(a<=b);//a 가 b보다 작거나 같으면 true, 아니면 false
    boolean result5=(a==b);//a 와 b 가 같으면 true, 아니면 false
    boolean result6=(a!=b);//a 와 b 가 다르면 true, 같으면 false
    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);
    System.out.println(result4);
    System.out.println(result5);
    System.out.println(result6);
    
    
    //논리연산
    //1 논리 AND : &&, 모든 조건이 만족하면 true, 아니면 false
    //2 논리 OR  : ||, 하나의 조건이라도 만족하면 true, 아니면 false
    //3 논리 NOT : ! , 조건  결과가 true 이면 false, 조건 결과가 false 이면 true
    
    int x=10;
    int y=20;
    boolean andResult =(x==10)&&(y==10); //모든 조건이 만족하지 않기 때문에 false
    boolean orResult =(x==10)||(y==10); //하나의 조건이 만족해서 true
    boolean notResult =!(x==10);//x!=10과 동일한 조건
    
    System.out.println(andResult);
    System.out.println(orResult);
    System.out.println(notResult);
    
    //내일 여기서 부터
    
    
  }

  public static void hello(){
    
    System.out.println("안녕자바");
  }
  
  
  public static void main(String[] args) {
    // TODO 주석 :구현해야할 기능을 작성
    
    
    //메소드 호출
     //ex01();
     //ex02();
     //ex03();
       ex04();
      
  }
  
  

}
