import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Box here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wall extends Actor implements Obstacle
{
    
    public void act() 
    {
      /* Actor bullet;
       bullet = getOneObjectAtOffset(0, 0, Bullet.class);
       Actor enemyBullet;
       enemyBullet = getOneObjectAtOffset(0, 0, EnemyBullet.class);
       
       if(bullet !=null || enemyBullet!=null)
        {
            
            getWorld().removeObject(this);
        }
        */
    } 
    public String toString()
    {
        return "Wall";
    }
}
