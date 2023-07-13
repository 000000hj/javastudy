package ex01_branch;

public class MainWrapper {

  
  public static void ex01() 
  {
    //점수에 따른 학점(if문)
    int score = 100;
    char grade = ' ';  // 'A', 'B', 'C', 'D', 'F'

    if(score>=90)grade='A';
    else if(score>=80) grade='B';
    else if(score>=70) grade='C';
    else if(score>=60) grade='D';
    else if(score<60) grade='F';
  System.out.println(grade);
    
  }
  
  public static void ex02() {
  //점수에 따른 학점(switch문)
    int score =100;
    char grade=' ';  // 'A', 'B', 'C', 'D', 'F'
    
    switch (score/10)
    {
     case 10:
     case 9:
      grade='A';
      break;
      
    case 8:
      grade='B';
      break;
      
    case 7:
      grade='C';
      break;
      
    case 6:
      grade='D';
      break;
      
      default:
        grade='F';
        break;
    }
    System.out.println(score+"점은"+grade+"학점입니다.");
  }
  
  public static void ex03() {
    
      // 점수와 학년에 따른 학점
      // 1~3학년 : 60점 이상 합격, 아니면 불합격
      // 4~6학년 : 70점 이상 합격, 아니면 불합격
      int score = 60; // 점수
      int scYear = 4;  // 학년
      String pass;  // "합격", "불합격"
      
      if(scYear<4) {
        pass=(score>=60)?"합격":"불합격"; }
      else
        {pass=(score>=70)?"합격":"불합격";}
      
      System.out.println(scYear+"학년"+score+"점은"+pass+"입니다");
   
  }
  
  public static void ex03_2() {
    // 점수와 학년에 따른 학점
    // 1~3학년 : 60점 이상 합격, 아니면 불합격
    // 4~6학년 : 70점 이상 합격, 아니면 불합격
    int score = 60; // 점수
    int scYear = 4;  // 학년
    int passScore; //합격의 최소점수
    String pass;  // "합격", "불합격"
    
    if(scYear<=3) {
      passScore=60;
    }else {
      passScore=70;
    }
    
    if(score>=passScore) {
      pass="합격";
    }else {
      pass="불합격";
    }
    System.out.println(passScore);
  }
 
  public static void ex04() {
    // 메뉴에 따른 가격
    // 아메리카노 : 2000
    // 카페라떼 : 2500
    // 밀크티 : 3000
    // 기타 : 5000
  String order = "아메리카노";
  int price=0;
    
   /* 
    
    if(order.equals("아메리카노"))price=2000;
    if(order.equals("카페라떼"))price=2500;
    if(order.equals("밀크티"))price=3000;
    if(order.equals("기타"))price=5000;
    
    System.out.println(order+"의 가격은"+price+"원 입니다.");  
    */
   
    
    switch(order)
    {
    case "아메리카노":
      price=2000;
      break;
    case "카페라떼":
      price=2500;
      break;
    case "밀크티":
      price=3000;
      break;
   default:
      price=5000;
      break;
    }
    System.out.println(order+"의 가격은"+price+"원 입니다.");
  }
  
  public static void ex05() {
    // 월에 따른 계절
    // 3 ~ 5 : 봄
    // 6 ~ 8 : 여름
    // 9 ~ 11: 가을
    // 12 ~ 2: 겨울
    int month = 7;
    String season;  // "봄", "여름", "가을", "겨울"
    
    if(month>2&&month<=5)season="봄";
    else if(month>5&&month<=8)season="여름";
    else if(month>8&&month<=11)season="가을";
    else season="겨울";
      System.out.println(month+"월은 "+season+"입니다");
  }
  
  public static void ex06() {
    // 월에 따른 분기
    // 1 ~ 3 : 1분기
    // 4 ~ 6 : 2분기
    // 7 ~ 9 : 3분기
    // 10 ~ 12 : 4분기
    int month = 7;
    
    System.out.print(month+"월은 ");
    if(month>0&&month<=3)System.out.print("1분기");
    else if(month>3&&month<=6)System.out.print("2분기");
    else if(month>6&&month<=9)System.out.print("3분기");
    else System.out.println("4분기");
    System.out.println(" 입니다");
    
  }
  
  public static void ex07() {
    //10일 후 요일은?
    int day = 13;  // 13일은 목요일
    int nDay = 10;  // 10일
    String weekname;  // "월", "화", "수", "목", "금", "토", "일"
    
    
    switch ((day+nDay)%7) {
    case 0:
      weekname="목";
      break;
    case 1:
      weekname="금";
      break;
    case 2:
      weekname="토";
      break;
    case 3:
      weekname="일";
      break;
    case 4:
      weekname="월";
      break;
    case 5:
      weekname="화";
      break;
     default:
       weekname="수";
       break;
    }
    System.out.println(nDay+"일후는 "+weekname+"요일 입니다.");
    
    
   
    
  }
  
  public static void ex08() {
    // 대소문자 변환 (구글링으로 아스키코드 검색 후 참고)
    char ch = 'A';  // 임의의 대문자 또는 소문자
    System.out.print("대문자:"+ch+",");
    ch='A'+32;   //A는65,a는97 정도는 기억하자
    System.out.println("소문자"+ch);
    
  }
  public static void main(String[] args) 
  {
   
    ex01();
    ex02();
    ex03();
    ex04();
    ex05();
    ex06();
    ex07();
    ex08();
  }

}
