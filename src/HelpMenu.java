import greenfoot.*;
/**
 * Write a description of class HelpMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HelpMenu extends TankWorld
{
    public HelpMenu()
    {
        setBackground("HelpMenu.png");
        this.addObject(new CloseButton(), 975, 30);
    }
}
