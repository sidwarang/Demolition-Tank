import greenfoot.*;
/**
 * Write a description of class HelpButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HelpButton extends Actor
{
    Receiver receiver=new PressButton();
    Command command=new PressHelpCommand(receiver);
    public HelpButton()
    {
        GreenfootImage img = getImage();
        img.scale(220,46);
        setImage(img);
    }
    public void invoke() 
    { 
        if (Greenfoot.mouseClicked(this)) {
            command.execute();
        }
    }
    public void act() 
    {
        invoke();
    }
}
