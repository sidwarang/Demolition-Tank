import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HorizontalObstacle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HorizontalObstacle extends Actor implements Obstacle
{
     public HorizontalObstacle()
   {
    GreenfootImage img = getImage();
        img.scale(img.getWidth()+240,img.getHeight()+10);
        setImage(img);
    }
    public void act() 
    {
        Actor bullet;
       bullet = getOneObjectAtOffset(-100, -100, Bullet.class);
       if(bullet !=null)
        {
            getWorld().removeObject(bullet);
        }
    }   
    public String toString()
    {
        return "Horizontal Obstacle";
    }
}
