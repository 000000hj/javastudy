package ex05__access_modifier;
/*
 * 접근 제어 지시자(Access Modifier)
 * 1.private  : 같은 클래스 내부에서만 접근할 수 있다.
 * 2.default  : 동일한 패키지에서만 접근할 수 있다. (access modifier를 작성하지 않는 경우)
 * 3.protected:동일한 패키지 or 다른 패키지에 있는 상속 관계 클래스만 접근할 수 있다.
 * 4.public   :어디서든 접근할 수 있다.
 * 
 * */

/*
 * 정보은닉(Information Hiding)
 * 1. 객체가 가진 내부 정보 (필드) 를 외부에 직접 노출하지 않는다.
 * 2.외부로부터 내부 정보(필드) 를 숨김으로써 정보를 안전하게 관리할 수 있다.
 * 3.Java에서는 정보 은닉을 위해서 private 처리하고, 메소드는 public 처리한다.
 * 4.java에서는  메소드를 통해서 필드에 접근한다.(필드에 직접 접근할 수 없다)
 * 
 */
 /*
  * Getter 와 Setter
  * 1.Getter
  *     1)필드값을 외부로 반환(return)하는 메소드
  *     2)"get+필드명" 형식의 이름을 가지는 메소드
  *     3) 메소드 이름을 마음대로 바꾸면 안된다.
  * 2.Setter
  *     1)외부로부터 받아 온 값(파라미터)을 필드에 저장하는 메소드이다.
  *     2)"set+필드명" 형식의 이름을 가지는 메소드이다.
  *     3) 메소드 이름을 마음대로 바꾸면 안된다.
  *     
  * 3. boolean타입의 필드는 Getter/Setter의 이름 형식이 다르다.
  * */
public class MainWrapper {

  public static void main(String[] args) {
    
    //User 객체(객체명 u) 생성
   User u=new User();
   //User 객체에 데이터 저장
   u.setId("admin");
   u.setAge(1000);
   u.setName("잉바보");
  
   
   //User 객체의 데이터 확인
   System.out.println(u.getId());
   System.out.println(u.getAge());
   System.out.println(u.getName());
  }

}
