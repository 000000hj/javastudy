package ex07_TourGuide;

public class TourGuide implements Tour{

  private Tour tour;
  private String sight;
  private String leisure;
  private String meal;
  
  public String getSight() {
    return sight;
  }

  public void setSight(String sight) {
    this.sight = sight;
  }

  public String getLeisure() {
    return leisure;
  }

  public void setLeisure(String leisure) {
    this.leisure = leisure;
  }

  public String getMeal() {
    return meal;
  }

  public void setMeal(String meal) {
    this.meal = meal;
  }

  public Tour getTour() {
    return tour;
  }

  public void setTour(Tour tour) {
   
    this.tour=tour;
    
  }

  public void sightseeing() {
    
    tour.sightseeing();
  
  }

  public void leisure() {
    tour.leisure();
    
    
  }

  public void meal() {
    
   
    tour.meal();
  }

}
