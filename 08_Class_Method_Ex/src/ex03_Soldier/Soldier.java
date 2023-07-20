package ex03_Soldier;

public class Soldier {

private Gun gun;


//갖고다닐 총

public Soldier(Gun gun)
{
  this.gun=gun;
}

//장전할 총알
public Soldier(int bullet)
{
  gun=new Gun(bullet);
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
