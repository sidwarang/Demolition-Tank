import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FollowStrategy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FollowStrategy  implements IMoveStrategy
{
    public void move(Enemy enemy)
    {
      enemy.followPlayersMotion();
    }
}
