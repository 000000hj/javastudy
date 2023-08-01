package ex02_Soldier;

public class Soldier {

private Gun gun;


//갖고다닐 총

public Soldier (Gun gun)
{
  this.gun=gun;
}

//장전할 총알
public Soldier(int bullet)
{
  gun=new Gun(bullet);
  
}

public void reload(int bullet)throws RuntimeException
{
  gun.reload(bullet);
}
public void shoot()throws RuntimeException
{
  gun.shoot();
}

  
  
  
}
