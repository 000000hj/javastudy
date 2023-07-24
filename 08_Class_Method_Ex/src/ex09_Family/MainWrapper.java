package ex09_Family;

public class MainWrapper {
  
  
  public static void ex01()
  {
    //가족이 3명인 경우
    Family f=new Family(3);
  
//    가족의 이름3개,나이3개
    String[] name= {"나","엄마","아빠"};
    int []age= {20,40,43};
    
    //default 생성자+setter
   for(int i=0;i<f.getFamily().length;i++)
   {
     f.getFamily()[i]= new Person(); //디폴트 생성자를 이용해서 배열 요소를 저장해 둔다.
     f.getFamily()[i].setName(name[i]); //Setter를 이용해서 이름을 저장한다.
     f.getFamily()[i].setAge(age[i]);  // Setter 를 이용해서 나이를 저장한다.
   }
//확인
   
   for(int i=0;i<f.getFamily().length;i++)
   {
     System.out.println((i+1)+"번째 가족 이름:"+f.getFamily()[i].getName());
     System.out.println((i+1)+"번째 가족 나이:"+f.getFamily()[i].getAge());
   }
  }
  
  public static void ex02() {
    //Person이 3명인 Family 객체 생성
    Family f= new Family(3);
    
    //가족의 이름 3개,나이3개
    String[] name= {"나","엄마","아빠"};
    int []age= {20,40,43};
    
    //파라미터가 2개인 생성자
    for(int i=0;i<f.getFamily().length;i++)
    {
      f.getFamily()[i]=new Person(name[i],age[i]);
    }
    
    //확인
    for(int i=0;i<f.getFamily().length;i++)
    {
      System.out.println((i+1)+"번째 가족 이름:"+f.getFamily()[i].getName());
      System.out.println((i+1)+"번째 가족 나이:"+f.getFamily()[i].getAge());
    }
  }
  
  public static void ex03()
  {
    //ex01()리팩토링
    Family f= new Family(3);
    
    //가족의 이름 3개,나이3개
    String[] name= {"나","엄마","아빠"};
    int []age= {20,40,43};
    
    Person[]family =f.getFamily();
    
    for(int i=0;i<family.length;i++)  //파란색은 필드 - 변수라는 의미
    {
      family[i]=new Person();
      family[i].setName(name[i]);
      family[i].setAge(age[i]);
    }
    
    //확인
    
    for(Person p:family) {
      if(p!=null) {
      System.out.println("가족 이름:"+p.getName());
      System.out.println("가족 나이:"+p.getAge());
      }
    }
  }
  
  public static void ex04() {
    
    //ex02 리팩토링
    Family f= new Family(3);
    
    //가족의 이름 3개,나이3개
    String[] name= {"나","엄마","아빠"};
    int []age= {20,40,43};
    
    Person[]family=f.getFamily();
    
    for(int i=0;i<family.length;i++)
    {
      family[i]=new Person(name[i],age[i]);
    }
    
    //확인(널 포인터 익셉션)
    
    family[1]=null; //NullPointerException 오류가 난다.
    for(Person p:family) {
      if(p!=null) {//그러므로 오류 방지를 위해 null이 아닐때의 조건을 걸어준다
      System.out.println("가족 이름:"+p.getName());
      System.out.println("가족 나이:"+p.getAge());}
    }
    
  }
  public static void main(String[] args) {
    

  // ex01();
   //ex02();
   //ex03();
   ex04();
  
    
  }

}
