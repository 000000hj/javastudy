package ex02_Watch;

public class Watch {
/**
 * 시,분,초 정보를 가지고 있는 시계 클래스
 * addHour ,addMinute,addSecond 메소드를 이용해서 시,분,초 를 조작할 수 있다.
 * @since 2023.07.20
 * @version 1.0
 */
  /**
   * 시간 정보를 저장하는 필드로 0~23 사이 값을 가진다.
   */
  private int hour;
  /**
   * 분 정보를 저장하는 필드로 0~59 사이 값을 가진다.
   */
  private int minute;
  /**
   * 초 정보를 저장하는 필드로 0~59 사이 값을 가진다.
   */
  private int second;
  //Setter
  /**
   * 
   * @param param
   */
  public void setHour(int hour) {
    this.hour=hour;
  }
  /**
   * 
   * @param param
   */
  public void setMinute(int minute) {
    this.minute=minute;
  }
  /**
   * 
   * @param param
   */
  public void setSecond(int second) {
   this.second=second;
  }
  
  
  
  //Getter
  public int getHour()
  {
    return hour;
  }
  public int getMinute(){
    return minute;
  }
  public int getSecond(){
    return second;
  }
  /**
   * 필드 hour 의 파라미터 param을 더하는 메소드<br>
   * 필드hour 값은 0~23 사이의 값을 가질 수 있도록 처리해야 한다.
   * @param param 증가시킬 시간 정보
   */
  public void addHour(int param) {
    if(param<=0)
    {
      return;//메소드를 끝낸다
    }
  hour+=param;
  hour%=24;
  
  }
  /**
   * 필드 minute에 파라미터 param을 더하는 메소드<br>
   * 필드 minute 값은 0~59 사이의 값을 가질 수 있도록 처리해야한다.<br>
   * 필드 minute 값이 60보다 크거나 같으면 필드 hour 값도 증가시켜야한다.<br>
   * @param param 증가시킬 분 정보
   */
  public void addMinute(int param) {
    if(param<=0)
    {
      return;//메소드를 끝낸다
    }
  minute+=param;
  addHour(minute/60);
  minute%=60;
 
  }
  
  /**
   * 필드 second 에 파라미터 param을 더하는 메소드<br>
   * 필드 second 값은 0~59 사이의 값을 가질 수 있도록 처리해야한다.<br>
   * 필드 second 값이 60보다 크거나 같으면 필드 minute 값도 증가시켜야한다.<br>
   * @param param 증가시킬 초 정보
   */
  
  public void addSecond(int param) {
    if(param<=0)
    {
      return;//메소드를 끝낸다
    }
  second+=param;
  addMinute(second/60);
  second%=60;
  
  
  }
  
  public void showTime(){
    System.out.println(getHour()+"시"+getMinute()+"분"+getSecond()+"초");
  }
  
  
}
