package Soldier;

public class Soldier {

	private Gun gun;
	private int bullet; 
	
	public void Soldier()
	{
		
	}
	public  Soldier(Gun gun) {
		this.gun=gun;
	}
	
	public Soldier(int bullet)
	{
		Gun gun=new Gun(bullet);
	}
	
	public void reload(int bullet)
	{
		gun.reload(bullet);
	}
	
	public void shoot()
	{
		gun.shoot();
	}
}
