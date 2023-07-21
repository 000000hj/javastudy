package ex06_Member;

public class Address {

  
  private String postCode;  //우편번호
  private String roadAddr; //도로명 주소
  private String jibunAddr; //지번 주소
  private String detailAddr; //상세 주소
  
  
  
  //Setter
  public void setPostCode(String postCode)
  {
    this.postCode=postCode;
  }
  
  public void setRoadAddr(String roadAddr)
  {
    this.roadAddr=roadAddr;
  }
  
  public void setJibunAddr(String jibunAddr) {
    this.jibunAddr=jibunAddr;
  }
  public void setDetailAddr(String detailAddr)
  {
    this.detailAddr=detailAddr;
  }
  
  //Getter
  
  public String getPostCode()
  {
    return postCode;
  }
  
  public String getRoadAddr()
  {
    return roadAddr;
  }
  
  public String getJibunAddr() {
    return jibunAddr;
  }
  public String getDetailAddr()
  {
    return detailAddr;
  }
}
