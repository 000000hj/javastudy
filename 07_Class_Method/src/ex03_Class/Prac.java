package ex03_Class;

public class Prac {

  public int compare(int a,int b)
  {int max=0;
    if(a==b)
    {System.out.println("같습니다"); return 0;}
    if(a>b) {max=a;}
    if(a<b) {max=b;}
    return max;
  }
}
