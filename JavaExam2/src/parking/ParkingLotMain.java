package parking;



public class ParkingLotMain {

  public static void main(String[] args) {
    try {
      
      ParkingLot parkingLot = new ParkingLot("대박주차장");
      parkingLot.manage();
      
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  

  }
}
