package kr.co.gdu;


/**
 * 
 * 덧셈, 뺄셍 ,곱셈, 나눗셈 기능을 제공하는 계산기 클래스
 * 
 * @author 홍길동
 * @since 2023.07.19
 * @version 1.0.0
 */

public class Calculator {
  
  /**
   * 실수 두개를 전달 받아서 그 합을 반환하는 메소드
   * @param a 실수
   * @param b 실수
   * @return  파라미터 두개를 더한 결과
   */
  public double addition(double a,double b) {
    return a+b;
  }
    
  /**
   * 실수 두개를 전달 받아서 그 차를 반환하는 메소드
   * @param a 실수
   * @param b 실수
   * @return  파라미터 두개를 뺀 결과
   */
  public double subtraction(double a,double b) {
    return a-b;
  }
  
  /**
   * 실수 두개를 전달 받아서 그 곱을 반환하는 메소드
   * @param a 실수
   * @param b 실수
   * @return  파라미터 두개를 곱한 결과
   */
  public double multiplication(double a,double b) {
    return a*b;
  }
  
  /**
   * 실수 두개를 전달 받아서 나눈 몫을 반환하는 메소드
   * @param a 실수
   * @param b 실수
   * @return  파라미터 두개를 나눗셈한 결과
   */
  public double division(double a,double b) {
    return a/b;
  }
  
}

