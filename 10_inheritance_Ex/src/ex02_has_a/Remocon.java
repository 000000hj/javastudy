package ex02_has_a;

public class Remocon {

  private int ch=0; //0~MAX_CH
  private int vol=10;//0~MAX_VOL
  
  
  private final int MAX_CH=99;
  private final int MAX_VOL=10;
  
  
  public void upCh() {
    
    ch++;
    if(ch>MAX_CH)
    {
      ch=0;
    }
    
    System.out.println("현재채널:"+ch);
  }
  
  
  public void downCh() {
    
    ch--;
    if(ch<0)
    {
      ch=MAX_CH;
    }
    
    
    System.out.println("현재채널:"+ch);
  }
  
  
  
  
  public void upVolume() {
    
    if(vol>=MAX_VOL)
    {
      vol=MAX_VOL;
      System.out.println("현재볼륨:"+vol);
      return;
    }
    
    vol++;
    System.out.println("현재볼륨:"+vol);
  }
  
  
  
  public void downVolume() {
    
   
    if(vol==0)
    {
      System.out.println("현재볼륨:"+vol);
      return;
    }
    
    vol--;
   
    System.out.println("현재볼륨:"+vol);
  }
  
  
  
  
  public int getCh() {
    return ch;
  }
  public void setCh(int ch) {
    this.ch=ch;
  }
  public int getVolume() {
    return vol;
  }
  public void setVolume(int vol) {
    this.vol=vol;
  }
}
