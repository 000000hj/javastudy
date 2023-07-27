package List;
import java.util.ArrayList;
import java.util.List;

public class MainWrapper {

  public static void main(String[] args) {
   
    
    List<String>season; 
    
    season=new ArrayList<String>();
    
    season.add("여름");
    season.add("가을");
    season.add("겨울");
    season.add(0,"봄");
    
    System.out.println(season);
    for(int i=0;i<season.size();i++)
    {
    System.out.println(season.get(i));
    }
    
  }

}
