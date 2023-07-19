package ex05__access_modifier;

public class User {

  //필드
  private String id;
  private int age;
  private String name;
  
  //메소드
  

  //setter :외부로부터 전달된 값(파라미터)를 필드에 저장하는 메소드
  public void setName(String userName)
  {
    name=userName;
  }
  public void setId(String userId)
  {
    id=userId;
  }
  
  public void setAge(int userAge)
  {
    age=userAge;
  }
  //getter :필드값을 외부로 반환(return)하는 메소드
  public String getId() {
    return id;
  }
  public int getAge() {
    return age;
  }
  
  public String getName()
  {
    return name;
  }
}
