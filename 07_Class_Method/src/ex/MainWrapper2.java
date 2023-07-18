package ex;

public class MainWrapper2 {

  public static void ex01(int a, int b)//값을 복사
  {
    System.out.println(a+","+b);
    a++;
    b++;
    System.out.println(a+","+b);

  }
  public static void main(String[] args) {
   int a=10;
   int b=20;
   ex01(a,b); //10 ,20 출력
   System.out.println(a+","+b);
  }

}
