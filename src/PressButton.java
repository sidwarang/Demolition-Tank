import greenfoot.*;
/**
 * Write a description of class PressButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PressButton implements Receiver
{
    public void pressStart()
    {
        Greenfoot.setWorld(new Level1(new ScoreManager()));    
    }
    public void pressHelp()
    {
        Greenfoot.setWorld(new HelpMenu());
    }
}
