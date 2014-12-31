import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gamemenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameMenu extends TankWorld
{

    /**
     * Constructor for objects of class Gamemenu.
     * 
     */
    public GameMenu()
    {
        
     setBackground("Menu.png"); 
	this.addObject(new StartButton(), 350, 550);
	this.addObject(new HelpButton(), 650, 550);
     
    }
    public void started() {
        Greenfoot.playSound("Background.mp3");
               // Greenfoot.setWorld(new Credits());
        //Greenfoot.setWorld(new Level1(new ScoreManager()));
    }
}
