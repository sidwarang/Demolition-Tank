import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import javax.swing.*;

public class ShowActors extends Actor
{
    int count = 0;
    public void act() {  


        if(count==0)
        {
            AllActors a= new AllActors();
            showAllActors(a.getIterator());
        }
        count=1;
        Greenfoot.stop();
    }  

    public void showAllActors(ArrayList<Actor> allActors)
    {
        IteratorImpl i=new IteratorImpl(allActors);
        int x=50;
        int y=150;
        int c=0;
        boolean first=true;
        getWorld().showText("Game Characters",500,50);

        while(!i.isDone())
        {
            if((c % 3)==0)
            {

                getWorld().addObject(i.currentItem(),230,y);
                getWorld().showText(i.currentItem().toString(),120,y);
            }
            if((c % 3)==1)
            {

                getWorld().addObject(i.currentItem(),500,y);
                getWorld().showText(i.currentItem().toString(),390,y);
            }
            else if((c % 3)==2)
            {

                getWorld().addObject(i.currentItem(),900,y);
                getWorld().showText(i.currentItem().toString(),790,y);
                y+=120;
            }
            i.next();
            c++;
        }
    }
}
