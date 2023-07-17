package ex02_loop;

public class MainWrapper {

  public static void ex01() {
    // 구구단 출력하기
    // 2 x 1 = 2
    // 2 x 2 = 4
    // ...
    // 2 x 9 = 17
    int dan = 2;  // 이 곳에 원하는 구구단을 넣으면 된다.
    
    for(int i=1;i<10;i++)
    {
      System.out.println(dan+"x"+i+"="+dan*i);
    }
    
  }
  
  public static void ex02() {
    // 100000 넘을 때까지 60원씩 모금하면서 과정 출력하기
    // 1회 모금액 60원, 현재 모금액 60원
    // 2회 모금액 60원, 현재 모금액 120원
    // 3회 모금액 60원, 현재 모금액 180원
    // ...
    // 1667회 모금액 60원, 현재 모금액 100020원
    int GOAL = 100000;  // 목표 모금액
    int money = 60;  // 1회당 모금액
    int total = 0;  // 모금액 합계
    int nth = 1;  // 회차
    
    
    System.out.println("for문");
    for(;total<GOAL;nth++)
    {
      
      total+=money;
      System.out.println(nth+"회 모금액 " +money+"원,"+ "현재 모금액"+total+"원");
    }
    
    
    
   GOAL = 100000;  // 목표 모금액
   money = 60;  // 1회당 모금액
   total = 0;  // 모금액 합계
   nth = 1;  // 회차
    
    System.out.println("while문");
    while(total<GOAL)
    {
      total+=money;
      System.out.println(nth+"회 모금액 " +money+"원,"+ "현재 모금액"+total+"원");
      nth++;
    }
  }
  
  public static void ex03() {
    // 전체 구구단 출력하기 - 1
    // 2 x 1 = 2
    // ...
    // 9 x 9 = 81
    
    for(int i=2;i<=9;i++)
    {
      for(int j=1;j<=9;j++) {
        System.out.println(i+"x"+j+"="+i*j);
      }
    }
    
  }
  
  public static void ex04() {
    // 전체 구구단 출력하기 - 2
    // 2x1=2  3x1=3  4x1=4  ... 9x1=9
    // ...
    // 2x9=18 3x9=27 4x9=36 ... 9x9=81
    
    // 참고할코드
    System.out.print("2x1=2");  // 2x1=2를 출력한 뒤 줄을 바꾸지 않는다.
    
    
    for(int i=1;i<10;i++) {
      System.out.println();
      for(int j=2;j<10;j++) {
        System.out.print(j+"x"+i+"="+String.format("%-4d",i*j));
      }
    }
    System.out.println();//줄바꿈
  }
  
  public static void ex05() {
    // 삼각별 출력하기 - 1 (2중 loop)
    //     b=12345 
    // a=1   *
    // a=2   **
    // a=3   ***
    // a=4   ****
    // a=5   *****
    
    //a=1,star=1
    //a=2;star=1-2
    //a=3;star=1-3
    //a=4;star=1-4
    //a=5;star=1-5
    
   for(int a=1;a<=5;a++) {
      
      for(int i=1;i<=a;i++) {
        System.out.print("*");
      }
        System.out.println();//별출력이 끝나면 줄바꿔
    }
    
   System.out.println();
  }
 
  
    

    
 
  public static void ex06() {
    // 삼각별 출력하기 - 2 (2중 loop)
    //     b=12345
    // a=1   *****
    // a=2   ****
    // a=3   ***
    // a=4   **
    // a=5   *
    //
    //a=1;star=1-5
    //a=2;star=1-4
    //a=3;star=1-3
    //a=4;star=1-2
    //a=5;star=1
    
 //내 방식   
    for(int i=1;i<=5;i++)
    {  
      for(int j=5;j>=i;j--)
      {
        System.out.print("*");
      }
      System.out.println();
    }
    
//다른 방식    
    for(int i=1;i<=5;i++)
    {  
      for(int j=1;j<=6-i;j++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
    
    
    
   
    
  }
  
  public static void ex07() {
    // 삼각별 출력하기 - 3 (2중 loop)
    //     b=123456789
    // a=1       *      sp=1-4    st=1
    // a=2      ***     sp=1-3    st=3
    // a=3     *****    sp=1-2    st=5
    // a=4    *******   sp=1-1    st=7
    // a=5   *********  sp=1-0    st=9
    
    
  //내 방식1  
   for(int i=1;i<=5;i++)
    {
     
      for(int j=5;j>i;j--) {
        System.out.print(" ");//공백 출력하기
        
      }
      
      
      
      for(int k=1;k<=i;k++) {
      
        System.out.print("*");//별 출력 12345
      
      }
      
      for(int l=2;i>=l;l++)
      {
        System.out.print("*");//별출력01234
      }
      System.out.println();
  
     
    }
    System.out.println();
    
  //내 방식2
    for(int i=1;i<=5;i++)
    {
      //공백
     
        for(int j=5;j>i;j--) {
          System.out.print(" ");//공백 출력하기
          }
        //별출력
        for(int k=1;k<=i*2-1;k++)
        {
          System.out.print("*");
        }
      
      //줄바꿈 
      System.out.println();
      
    }
    
    
    
    //다른방식
    
    //행
    for(int row=1;row<=5;row++)
    {
      //공백
      for(int space=1;space<=5-row;space++)
      {
        System.out.print(" ");
      }
     //별출력
      {
        for(int star=6-row;star<=row+4;star++)
        {
          System.out.print("*");
        }
        System.out.println();
        
      }
    }
    
    
    
    
    
    
    System.out.println();
  }
  

  
  public static void ex08() {
    // 삼각별 출력하기 - 4 (2중 loop)
    //     b=123456789
    // a=1   *********  sp=1-0    st=1-9
    // a=2    *******   sp=1-1    st=1-7
    // a=3     *****    sp=1-2    st=1-5
    // a=4      ***     sp=1-3    st=1-3
    // a=5       *      sp=1-4    st=1-1
    
 //내 방식   
  for(int i=5;i>=1;i--)
    {
      //공백출력
        for(int j=5;j>i;j--) {
          System.out.print(" ");
           }
        
      //별출력 
       for(int k=i*2-1;k>0;k--)
       {
         System.out.print("*");
       }
       
        
        
        //줄바꿈
      System.out.println();
    }
  
  //다른방식
  
  for(int row=1; row <= 5; row++) {
    for(int space=1; space <= row-1; space++) {
      System.out.print(" ");
    }
    for(int star=row; star <= 10-row; star++) {
      System.out.print("*");
    }
    System.out.println();
  }
  }

    

  
  public static void main(String[] args) {
    
    String str1= String.format("%d",10);
    String str2=String.format("%2d",10);
    String str3=String.format("%4d",10);
    String str4=String.format("%-3d",10);
    String str5=String.format("%-4d",10);
    ex01();
    ex02();
    ex03();
    ex04();
    ex05();
    ex06();
    ex07();
    ex08();
    System.out.print(str3+str2+str1+str3);
    System.out.println();
    System.out.println(str5+str4);
  }
  
}