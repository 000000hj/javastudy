package ex02_Loop;

public class MainWrapper {

  
  /*
   * 1. 연속된 숫자(수열)을 생성하는 목적의 반복문이다.
   * 2. 형식 
   *    for(초깃값;조건문;증감문){
   *      실행문
   *      }
   *      
   *  3.실행순서
   *  초깃값->조건문->실행문->조건문->실행문->증가문->조건문->....
   * */
  
  public static void ex01() {
    //1~10 출력하기
    for(int n=1;n<=10;n++) {
      System.out.println(n);
    }
      
      //10~1출력하기
      
      for(int n=10;n>=1;n--)
      {
        System.out.println(n);
      }
    }
  public static void ex02() {
    //특정 횟수만큼 반복시키는 for문
    int count =5;//5번
    for(int n=0;n<count;n++)
    {
      System.out.println(n+"번");
    }
  }
  
  
  /*
   * while문
   * 1. 특정 조건을 만족하면 실행되는 반복문이다.
   * 2. 형식
   *  while(조건문){
   *    실행문
   *    }
   *    
   * */
  
  public static void ex03() {
    int n=0;
    while(n<10) {
      System.out.println(n);
      n++;
    }
  }
  
  
  /*
   * do while 문
   * 1. 반드시 1번은 실행되는 while문이다.
   * 2. do{
   *        실행문
   *        }
   *    while(조건문);
   * */
  
  public static void ex04() {
    int n=100;
    do {
      System.out.println(n);
      n++;
    }while(n<10) ;
     
    
  }
  
  /*
   * break문
   * 1. switch문을 종료한다.
   * 2. 반복문(for,while,do while) 을 종료한다.
   * */
  
  public static void ex05()
  {
    //무한루프 만드는 2가지 방법
    //1.while(true){}
    //2.for(;;){}
    
    
    //무한루프와 break 를 이요한 1~10 출력하기
    
    int n=1;
    while(true)
    {//무한루프가 언제 끝나는지 초반에 명시해주는것이 좋은코드이다.
      //if(n==11)break;
      if(n>10)break;
      System.out.println(n);
      n++;
    }
  }
  
  
  
  /*
   * continue문
   * 1. 반복문의 실행 시작 지점부터 다시 실행한다.
   * 2.continue문 이후의 코드를 실행에서 제외하고자 할때 사용한다.
   * 
   * */
  
  public static void ex06() {

    //1~50사이 정수 중 7의 배수는 제외하고 출력하기
    
    for(int i=1;i<=50;i++)
    {
      if(i%7==0){ continue;}// for문 증감문(n++)으로 돌아가시오.        
      System.out.println(i);
      
    }
    
  }

  
  public static void ex07() {
    //중첩(nested)for문
    
    for(int day=1;day<=5;day++)
    {
      
      for(int hour=1;hour<=8;hour++) {
        for(int min=1;min<=60;min++)
          
        {
        System.out.println(day+"일차"+hour+"교시"+min+"분");
        }
      }
    }
  }
  public static void main(String[]args) {
  
    //ex01();
    //ex02();
    //ex03();
    //ex04();
    // ex05();
    //ex06();
    ex07();
  }
}




