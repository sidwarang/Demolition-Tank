import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Credits here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Credits extends BaseLevel
{
    int count =  0;
    public Credits()
    {
    }

    public void act() 
    {
        if(count==0)
        addObject(new ShowActors(),0,0);
        count =1;
    }
}