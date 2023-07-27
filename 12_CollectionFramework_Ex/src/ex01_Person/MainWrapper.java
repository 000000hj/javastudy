package ex01_Person;

import java.util.ArrayList;
import java.util.List;

public class MainWrapper {

  public static void main(String[] args) {

    List<Person> family=new ArrayList<Person>();
  
    family.add(new Person("곽두팔",49));
    family.add(new Person("마동석",98));
    family.add(new Person("곽광구",100));
    
   
   
    //가족 모두 저장하고 for문으로 확인하기
    
    for(int i=0,length=family.size();i<length;i++)
    {
      System.out.println(family.get(i));
      System.out.println(family.get(i).getName());
      System.out.println(family.get(i).getAge());
    }
  }

 

}
