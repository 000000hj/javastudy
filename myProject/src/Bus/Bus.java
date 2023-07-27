package Bus;

import java.util.ArrayList;
import java.util.List;

public class Bus {

  private List<Seat>seats; //빈좌석을 만들 객체리스트
  private final int LIMIT=25;//최대 25인승
  
  public Bus() {
    seats=new ArrayList<Seat>();//빈 좌석을 놓을 공간 만들어
    for(int cnt=0;cnt<LIMIT;cnt++)
    {
      seats.add(new Seat());//공간seats에 빈좌석 1개 추가
    }//즉 seats라는 빈공간에 빈좌석 LIMIT개를 추가한다.
    
  }
  
  
  
  ////////탑승 메소드
    public void getOn(int seatNo,Person person) //좌석번호, 앉을 사람
    {
      if(seatNo<1||seatNo>LIMIT) {//좌석번호1보다 작거나 최대 좌석 번호 보다 크면 출력
        System.out.println("존재하지 않는 좌석입니다.");
        return;
     }
      
      //현재자리 실제 배열위치는(좌석번호-1)
      Seat seat=seats.get(seatNo-1);//좌석 정보를 가져와라
      if(seat.getPerson()!=null) {//현재자리.인간정보가 비어있지 않으면 이미 앉은자리
        System.out.println("이미 점유된 좌석번호입니다.");
        return;
      }
      seat.setPerson(person);//앉을 수 있는 조건에 부합하면 착석!
      System.out.println(seatNo+"번 시트에"+ person+"착석했습니다.");//출력
      
    }
    
    
    
    
  ///////하차 메소드
    
    public void getOff(int seatNo) {
     Seat seat=seats.get(seatNo-1);//좌석 정보를 가져와라
    }
  
      
  }
    
    
  

