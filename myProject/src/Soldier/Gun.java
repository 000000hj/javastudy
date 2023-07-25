package Soldier;

public class Gun {
  private int bullet;
  private final int MAX_BULLET=50;
  
  public Gun(int bullet)
  {
  	this.bullet=bullet;
  }
  
  
  public void reload(int bullet)
  {
  	if(this.bullet+bullet>MAX_BULLET)
  	{
  		
  		System.out.println("최대 장전 가능치를 초과하여"+(MAX_BULLET-bullet)+"발은 장전 불가");
  		this.bullet=MAX_BULLET;
  		return ;
  		
  	}
  	this.bullet+=bullet;
  	System.out.println(bullet+"발이 장전됨");
  }
  
  
  public void shoot()
  {
  	if(bullet<=0)
  	{
  		System.out.println("총알부족");
  		return;
  	}
  	
  	
  		bullet--;
  		System.out.println("빵!");
  		System.out.println("현재"+bullet+"발이 남음");
  	
  }
}
