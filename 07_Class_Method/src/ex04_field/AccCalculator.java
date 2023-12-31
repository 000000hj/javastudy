package ex04_field;
/**
 * 
 * 연산 결과를 저장할 수 있는 계산기
 * 
 * @author 홍길동
 * @since  2023.07.19
 * @version 1.0.0
 *
 */
public class AccCalculator {
/*
 * 필드(field)
 * 1.객체가 가질 수 있는 값을 저장할 변수이다.
 * 2.클래스에서 선언한다.
 * 3.필드는 자동으로 초기화 된다.(0,0.0,false,null)
 * 4.정보 은닉을 위해서 private 처리한다.
 * */
  
  /**이 필드는 AccCaluclulator의 사칙연산 결과를<br>저장할 수 있는 필드이다.
   * 
   */
  
  private double value;
  /**
   * 파라미터 a를 필드 value에 더해주는 메소드
   * 
   * @param a 실수
   * 
   */
  public void addtion(double a) {
    value+=a;
    System.out.println("+"+a+"="+value);
  }
  
  /**
   * 파라미터 a를 필드 value에 빼 주는 메소드
   * 
   * @param a 실수
   * 
   */
  public void substraction(double a) {
  
  value-=a;
  System.out.println("-"+a+"="+value);
  }
  
  /**
   * 파라미터 a를 필드 value에 곱하는 메소드
   * 
   * @param a 실수
   * 
   */
  public void multiplication(double a) {
    
  value*=a;
  System.out.println("*"+a+"="+value);
  }
  /**
   * 파라미터 a를 필드 value에 나누는 메소드
   * 
   * @param a 실수
   * 
   */
  
  public void division(double a) {
    
  value/=a;
  System.out.println("/"+a+"="+value);
  }
  
  /** 필드 value를 출력하는 메소드
   * 
   */
  public void showValue()
{
  System.out.println(value);
}
}

