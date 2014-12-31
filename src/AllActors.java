import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.Iterator;
/**
 * Write a description of class ActorsList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AllActors implements ActorIterator
{  
	ArrayList<Actor> allActors=new ArrayList<Actor>();
	public AllActors()
	{
	   allActors.add(new Wall());
	   allActors.add(new Bullet());
	   allActors.add(new Enemy());
	   allActors.add(new Explosion());
	   allActors.add(new HorizontalObstacle());
	   allActors.add(new Obstacle1());
	   allActors.add(new EnemyBullet());
	   allActors.add(new Tank1());
	}

	public ArrayList<Actor> getIterator() 
	{
		return allActors;
	}
}