package HashMap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainWrapper {

  public static void main(String[] args) {

   List<No> number=new ArrayList<No>();
   
   number.add(new No("111-1111-1111"));
   number.add(new No("111-1221-1111"));
   number.add(new No("111-1341-5511"));
    
   
   Iterator<No>arm= number. iterator();
   while(arm.hasNext())
   {
     System.out.println(arm.next().getNumber());
   }
  }

}
