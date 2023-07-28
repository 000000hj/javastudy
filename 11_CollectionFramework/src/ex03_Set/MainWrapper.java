package ex03_Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainWrapper {
/*
 * 
 * Set
 * 1. 인덱스가 없다. 저장 순서가 없다.
 * 2. 중복 저장이 되지 않는다.
 * 
 */
  public static void ex01()
  {
   //Set 인터페이스 타입 선언
    Set<String>season;
    
    //HashSet 클래스 객체 생성
    season = new HashSet<String>();
    
    //요소 추가하기
    season.add("봄");
    season.add("여름");
    season.add("가을");
    season.add("겨울");
    season.add("봄");
    
    //전체 확인
    System.out.println(season);
  }
  
  public static void ex02() {
    //HashSet선언 & 생성
    Set<String>hobbies = new HashSet<String>();
    //요소 저장
    hobbies.add("독서");
    hobbies.add("요리");
    hobbies.add("운동");
    hobbies.add("체스");
    
    //for문 활용(인덱스가 없으므로 향상 for문)
    for(String hobby:hobbies)
    {
      System.out.println(hobby);
    }
  }
  
  
  public static void ex03() {
    
    //HashSet 선언 & 생성
    Set<String>flower=new HashSet();
    
    //요소 저장하기
    flower.add("국화");
    flower.add("장미");
    flower.add("튤립");
    flower.add("부르그만시아");
    
    //반복자 Iterator를 이용한 Set 순회
    Iterator<String>arm=flower.iterator(); //flowerSet에 집어넣을 수 있는 팔을 하나 만들자 라는 의미
    
    
 /*   System.out.println(arm.hasNext());//다음순서에 엘리먼트가 있는지 확인
    System.out.println(arm.next());//순서 없으니까 팔 집어넣고 잡히는거 하나 꺼내
    
    System.out.println(arm.hasNext());
    System.out.println(arm.next());//
    
    System.out.println(arm.hasNext());
    System.out.println(arm.next());
    
    System.out.println(arm.hasNext());
    System.out.println(arm.next());
    
    System.out.println(arm.hasNext());
    */
    while(arm.hasNext())//잡히는게 있음 꺼내라
    {
      System.out.println(arm.next());
    }
    
  }
  
  public static void ex04() {
    //동일한 객체 2개
    Person p1=new Person("홍길동",30);
    Person p2=new Person("홍길동",30);
    
    
    //HashSet 선언 & 생성
    Set<Person>people=new HashSet<Person>();
    
    //요소추가
    people.add(p1);
    people.add(p2);
    
    //확인
    System.out.println(people);
  }
  
  public static void ex05()
  {
    //ArrayList 선언 & 생성
   // List<Integer> numbers1=Arrays.asList(1,2,3,4,5);
  }
  
  public static void main(String[] args) {
    
  //ex01();
  //ex02();
 // ex03();
  ex04();
    
  }

}
