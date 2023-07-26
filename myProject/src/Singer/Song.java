package Singer;

public class Song {

  private String name;
  private String genre;
  private double time;
  
  public void Song()
  {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public double getTime() {
    return time;
  }

  public void setTime(double time) {
    this.time = time;
  }
  
  public void info()
  {
    System.out.print("제목:"+getName()+",");
    System.out.print("장르:"+getGenre()+",");
    System.out.print("재생시간:"+getTime()+"분");
  }

  
}
