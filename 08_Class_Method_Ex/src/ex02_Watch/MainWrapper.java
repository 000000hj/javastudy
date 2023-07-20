package ex02_Watch;

public class MainWrapper {

  public static void main(String[] args) {
  //Watch객체 생성&선언
    Watch watch = new Watch();
    
    //Watch 객체에 시,분, 초 정보 설정
    watch.setHour(9);
    watch.setMinute(40);
    watch.setSecond(30);
    
    //시,분,초 증가시키기
    
    watch.addHour(25);
    watch.addMinute(61);
    watch.addSecond(3661);
    
    //시간 보기
    watch.showTime();
    
  }

}
