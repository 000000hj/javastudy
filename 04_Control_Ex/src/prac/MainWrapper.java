package prac;

public class MainWrapper {

  public static void main(String []args)
  {
    for(int i=1;i<=5;i++)//행바꿈
    {
      for(int j=1;j<=6-i;j++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
