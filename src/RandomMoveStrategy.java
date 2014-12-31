import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RandomMoveStrategy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RandomMoveStrategy implements IMoveStrategy
{
    public void move(Enemy e)
    {
        e.moveRandom();
    }
}
