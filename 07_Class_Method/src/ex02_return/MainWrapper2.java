package ex02_return;

public class MainWrapper2 {

  
  /*
   * void 메소드 return
   * 1.반환값이 없는 메소드는 void 키워드를 사용한다.
   * 2. 이런 경우 return; 키워드를 이용해서 메소드 실행을 종료할 수 있다.
   * 3. return 키워드만 작성해야 한다.
   * 4.void 메소드 에서만 사용할 수 있다.
   * */
  public static void main(String[]args) {
    positivePrint(10);
    positivePrint(-10);
  }
  //전달된 인수가 양수이면 출력하고 아니면 출력하지 않는 positivePrint 메소드
  
 /* public static void positivePrint(int a) {
    if(a>0) {// if 자체로 끝나면 실행 여부와 관계없이 좋지 않은 코드이다.
      System.out.println(a);
    }
    */
  
  public static void positivePrint(int a) {
    if(a<0) {
      return;}//메소드의 종료조건만 기입해주는게 좋은코드 
    System.out.println(a);
    
  
  
}

}
