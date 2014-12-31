import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class ShowActorImpl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IteratorImpl implements ShowActorsIterator
{
    private ArrayList<Actor> allActors ;
    private int cursor ;
    private int max ;

    public IteratorImpl(ArrayList<Actor> allActors)
    {
        this.allActors = allActors ;
        cursor = 0 ;
        max = allActors.size() ;
    }

    public Actor first() {
        return allActors.get( 0 ) ;
    }

    public Actor next() {
        cursor++ ;
        if ( !isDone() )
            return allActors.get( cursor ) ;
        else return null;

    }

    public Actor currentItem() {
        return allActors.get( cursor ) ;
    }

    public boolean isDone() {
        if(cursor==max)
            return true ;
        else return false;
    }
}
