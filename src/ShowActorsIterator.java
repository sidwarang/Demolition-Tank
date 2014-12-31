import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ShowActorsIterator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface ShowActorsIterator
{
    Actor first();

    Actor next();

    Actor currentItem();

    boolean isDone();
}
