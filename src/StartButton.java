import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartButton extends Actor implements Invoker
{
    Receiver receiver=new PressButton();
    Command command=new PressStartCommand(receiver);
    public StartButton()
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
