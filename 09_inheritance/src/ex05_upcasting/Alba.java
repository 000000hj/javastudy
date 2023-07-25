package ex05_upcasting;
//학교 다니는 알바생
public class Alba extends Student{

  private String work;

  //new Alba()
  public Alba()
  {
    super();//생략 가능 new Student() 호출과 동일. 디폴트 생성자이므로 생략 가능
  }
  
  //new Alba("홍길동","가산대학교","투썸")
  public Alba(String name,String school,String work ) {  
   super(name,school);
   
   
   this.work=work;
   
  }
  
  
  
  public String getWork() {
    return work;
  }

  public void setWork(String work) {
    this.work = work;
  }
  
  public void working() {
    System.out.println("일함");
  }
  
  @Override
  public void info() {
    System.out.println("이름:"+ getName());
    System.out.println("학교:"+getSchool());
    System.out.println("직장:"+work);
  }
  


}
