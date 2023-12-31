package ex06_this;

/*
 * this
 * 1.필드나 메소드를 호출하는 객체의 참조값이다.
 * 2.클래스 내부에서만 사용할 수 있는 키워드이다.
 * 
 */
/**
 * <p>메소드를 연속해서 호출할 수 있는 메소드 체이닝(method chaining)이 가능한 계산기</p>
 *<p> 사칙연산 메소드를 연속해서 호출 할 수있다.</p>
 * @author 곽두팔
 *@since 2023.07.20
 *@version 1.0
 */
public class ChainCalculator {

  
  
  
  /**
   * 필드 value는 사칙연산의 결과를 저장하고 있다
   */
  private double value;
  
  public void printThis()
  {
    System.out.println(this);//여기서 this는 객체 자신을 지칭한다.
  }
  
  //Setter
  public void setValue(double value) {
    this.value=value;// ChainCalculator.value(필드의)=value 와 같은 의미
  }
  
  //Getter
  public double getValue() {
    return value;
  }
  
  
  public ChainCalculator on()
  {
    System.out.println(value);
    return this;
  }
 
  public ChainCalculator addition(double a) {
    value +=a;
    System.out.println("+"+a+"="+ value);
    return this;
  }
  public ChainCalculator substraction(double a) {
    value -=a;
    System.out.println("-"+a+"="+ value);
    return this;
  }
  
  public ChainCalculator multiplication(double a) {
    value *=a;
    System.out.println("x"+a+"="+ value);
    return this;
  }
  
  public ChainCalculator division(double a) {
    value /=a;
    System.out.println("/"+a+"="+ value);
    return this;
  }
  
  public void done()
  {
    System.out.println("결과:"+value);
    
  }
  

  
  
 
}
