package Singer;

public class Singer {

  private Song song;
  private String name;
  
  

  public Singer() {
    
  }
  
  public Song getSong() {
    return song;
  }

  public void setTitleSong(Song song) {
    this.song = song;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  

  public void info()
  {
    System.out.println("이름:"+getName());
    song.setName("호랑나비");
    song.setGenre("댄스");
    song.info();
    
  }
  
  
  
  

}
