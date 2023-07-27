package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainWrapper {

  public static void main(String[] args) {
    
    
    Set<String>food=new HashSet();
    
    
   food.add("갈비");
   food.add("소고기구이");
   food.add("닭안심");
   food.add("양갈비");
   
   Iterator<String>iterator=food.iterator();
   
   while(iterator.hasNext())
   {
     System.out.println(iterator.next());
   }
    
    
  }

}
