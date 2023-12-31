package ex02_random;

import java.util.UUID;

public class Ex04_UUID {

  public static void main(String[] args) {

    /*
     * java.util.UUID
     * 1. 전역 고유 식별자(Universal Unique ID)라는 뜻이다.
     * 2. 32개의 16진수를 랜덤하게 생성한다.
     * 3. UUID를이용해서 생성한 값은 중복이 없는것으로 처리한다.
     * 4. 생성된 UUID 값은 String으로 바꿔서 사용한다.
     */
    
    UUID uuid=UUID.randomUUID();
    String str= uuid.toString();
    System.out.println(str);
  }

}
