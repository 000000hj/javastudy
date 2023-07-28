package Set2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainWrapper {

  public static void main(String[] args) {

   Set<String>dog=new HashSet<String>();
   
   dog.add("리트리버");
   dog.add("핫도그");
   dog.add("불독");
   dog.add("진도");
   dog.add("코커스파니엘");
   
   dog.remove("핫도그");
   
   
   //반복자 돌리기
   Iterator<String>arm=dog.iterator();
   while(arm.hasNext())//다음 값이 있다면
   {
     System.out.println(arm.next());
   }
  }

}
