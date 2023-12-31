package ex04_Lotto;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Lotto {
  
  /**
   * 로또 구매<br>
   * 로또 구매를 위해서 사용자로부터 money를 입력 받는 메소드<br>
   * 로또 구매 비용은 최소 1000, 최대 100000이다.<br>
   * @return money 사용자가 입력한 로또 구매 비용에서 1000 미만 단위는 버리고 반환. ex) 5999 입력 시 5000 반환
   * @return 0 로또 구매 실패 시 반환
   */
  
  private int cnt;
  
  public int buyLotto() {
    Scanner sc =new Scanner(System.in);
    int money=sc.nextInt();
    sc.close();
    if(money<1000)
    {
      System.out.println(money+"원 Lotto 구매는 불가능합니다.");
      return money;
    }
    else if(money>100000)
    {
      System.out.println(money+"원 Lotto 구매는 불가능합니다.");
     
      return 0;
    }
    
    cnt=money/1000;
    
    return cnt;
  }
  
  /**
   * 로또 번호 생성<br>
   * 로또 구매 비용만큼 로또 번호를 생성하는 메소드<br>
   * 5게임씩 끊어서 생성된 로또 번호를 출력한다.<br>
   * @param money 로또 구매 비용
   */
  public void generateLotto(int money) {
    int arr[][] = new int[100][100];//arr[cnt][num]
    int num=6;
    int count=1;
    
    for(int i=0;i<cnt;i++)
    {
      
      
     //중복 제거 하는걸로 고치기(중복 검사구문 혹은 set형변수에 집어넣어 꺼내는 방식으로)
     if(count==6)
     {
       System.out.println("----------------------------");
       count=1;// 표시되는 번호 01 ,02 ...
     }
     System.out.print(String.format("0%d",count )+" :");
      //로또번호 삽입
      for(int j=0;j<num;j++)
      {
        arr[i][j]=(int)(Math.random()*45+1);
        System.out.print(String.format("%4d", arr[i][j]));
        
      }
      count++;
      System.out.println();
    }
    if(cnt==0)
    {return;}  
    System.out.println("----------------------------");
  }
  
}