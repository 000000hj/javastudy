package ex03_Class;

public class MainWrapper {

  public static void main(String[] args) {
    //Calculator 객체 선언
    Calculator myCalc ;
    Prac myPrac;
    //Calculator 객체 생성
    myCalc=new Calculator();
    myPrac=new Prac();
    
    //계산하고자 하는 실수 2개 준비
    
    double a=1.5;
    double b=1.2;
    int c=0;
    int d=10;
    
    //덧셈 뺄셈 곱셈 나눗셈 메소드 호출
    
    System.out.println(myCalc.addition(a, b));
    System.out.println(myCalc.subtraction(a, b));
    System.out.println(myCalc.multiplication(a, b));
    System.out.println(myCalc.division(a, b));
    System.out.println(myPrac.compare(c, d));
    

  }

}
