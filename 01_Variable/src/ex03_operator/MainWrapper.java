package ex03_operator;

public class MainWrapper {
  //ex01메소드 정의
  public static void ex01() {
    
    //정수연산
   int a=5;
   int b=2;
   
   
   int add=a+b;
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
    
    //Short circuit Evaluation
    //1. 논리 AND : 결과가 false 인 조건이 나타나면 더 이상 조건을 체크하지 않는다. 최종결과가 false로 정해졌기 때문이다.
    //2. 논리 OR  : 결과가 true  인 조건이 나타나면 더 이상 조건을 체크하지 않는다. 최종결과가 true 로 정해졌기 때문이다.
    
    int i=10;
    int j=10;
    
    boolean andSceResult = (++i ==10)&&(++j ==10); 
    System.out.println(andSceResult);
    System.out.println(i);
    System.out.println(j);
    
    boolean orSceResult =(j++ == 10)||(i++ == 10);
    System.out.println(orSceResult);
    System.out.println(i);
    System.out.println(j);
    
  }

  //ex05메소드 정의
  public static void ex05() {
    //조건 연산자(3개의 항을 사용하므로 삼항 연산이라고도 한다.)
    //조건식 ? true인 경우 결과 :false 인 경우 결과
   
    int score=100;
    
    String result = (score>=60)? "합격":"불합격";
    System.out.println(result);
    
  }
  
  public static void ex06() {


    //문자열 연결
    String str1 ="구디"+"아카데미";
    String str2 =4+"달라";
    String str3 =1+2+"번지";
    System.out.println(str1);
    System.out.println(str2);
    
    String str4=100+" ";//빈 문자열(" ")을 더해주면 문자열이 된다.
    String str5=1.5+" ";//빈 문자열(" ")을 더해주면 문자열이 된다.
    
    //참고. 문자열로 변환하는 메소드가 있다.
    String str6=String.valueOf(100);//잘 안쓸 뿐있다.
    
    System.out.println(str3);
    System.out.println(str4); 
    System.out.println(str5);
    System.out.println(str6);
    
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
     //ex04();
     //ex05();
     //ex06();
      
  }
  
  

}
