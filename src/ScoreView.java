import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class ScoreView here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreView extends Actor
{
    /**
     * Act - do whatever the ScoreView wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    String msg;
    String won;
    long counter = 999999999;
    long count = 0;
    public ScoreView(String msg,String result)
    {
        this.msg=msg;
        won = result;
    }
    
    public void act() 
    {
        //setImage(new GreenfootImage(won, 102, Color.WHITE, Color.BLACK));
        setImage(new GreenfootImage(won+"\n"+msg, 48, Color.WHITE, Color.BLACK));
        //try{Thread.sleep(4000);}catch(Exception e){}
       /* while(count<counter)
        {
            count++;
        }*/
        Greenfoot.delay(50);
        Greenfoot.setWorld(new Credits());
    }    
}
