import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends Actor
{
    /**
     * Act - do whatever the GameOver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    String str;
    
    
    public GameOver()
    {
        str = "Game\nOver";
    }
    
   
    public void act() 
    {
        
        
       setImage(new GreenfootImage(str, 102, Color.WHITE, Color.BLACK));
       
       Greenfoot.delay(50);
       //Greenfoot.setWorld(new Credits());
       
    }
  
}
