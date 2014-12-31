import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Obstacle1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Obstacle1 extends Actor implements Obstacle
{
   public Obstacle1()
   {
    GreenfootImage img = getImage();
        img.scale(img.getWidth()+15,img.getHeight()+100);
        setImage(img);
    }
    public void act() 
    {
        
    }
    public String toString()
    {
        return "Vertical Obstacle";
    }
}
