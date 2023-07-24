package ex04_override;

public class CafeLatte extends Espresso{
/*
 * 메소드 오버리아드 (Method Override)
 * 1. 슈퍼클래스으 ㅣ메소드를 서브클래스가 다시 만드는 것을 말한다.(메소드 덮어쓰기)
 * 2. 오버라이드 한 메소드는 @Override Annotation을 추가하는 것이 좋다.(권장이지만 필수로 하자.)
 * 3. 반드시 동일한 모습으로 오버라이드 해야 한다.
 * 
 */
  
  @Override  //오버라이드 한 메소드, 문법 체크를 해 준다.
  public void taste() {
    System.out.println("라떼 맛");
  }
}


//오버로딩은 메소드를 같은이름으로 여러개 오버라이딩은 덮어쓰기