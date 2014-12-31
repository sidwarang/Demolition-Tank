import greenfoot.*;
/**
 * Write a description of class CloseButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CloseButton extends Actor
{
   public CloseButton()
   {
       GreenfootImage img = getImage();
       img.scale(50,50);
       setImage(img);
   }
   public void act() 
   {
       if (Greenfoot.mouseClicked(this)) {
           Greenfoot.setWorld(new GameMenu());
       }
   }
}
