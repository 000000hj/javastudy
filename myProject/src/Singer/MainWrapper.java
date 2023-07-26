package Singer;

public class MainWrapper {

  public static void main(String[] args) {
    //객체 생성
    Song song=new Song();
    
    //제목:e ,장르: ㄷ ,재생시간:3.5분
    song.setName("e");
    song.setGenre("ㄷ");
    song.setTime(3.5);
    song.info();
    System.out.println();
    
    // 이름: 김흥국
    Singer singer =new Singer();
    singer.setName("김흥국");
    singer.setTitleSong(song);

    singer.info();
    //제목:호랑나비,장르:댄스,재생시간:3.5분
  }

}
