package ex07_TourGuide;

public class JapanTour implements Tour {

  @Override
  public void sightseeing() {
   System.out.println("ㅁ");

  }

  @Override
  public void leisure() {
   System.out.println("온천");

  }

  @Override
  public void meal() {
    System.out.println("스시");

  }

}
