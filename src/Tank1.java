import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tank1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tank1 extends Actor
{
    private int count =0;
    private StatBar statBar;
    private static final int damageCount = -200; 
    public Tank1() {
    }
    public Tank1(StatBar statBar)
    {
        this.statBar = statBar;
        //System.out.println(statBar.getValue());
        GreenfootImage img = getImage();
        img.scale(img.getWidth()+25,img.getHeight()+20);
        setImage(img);
    }

    public void act() 
    {

        if(Greenfoot.isKeyDown("left"))
        {
            turn(-3);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            turn(3);
        }
        if(Greenfoot.isKeyDown("up"))
        {
            move(5);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            move(-5);
        }
        if(Greenfoot.isKeyDown("w"))
        {
            if(count ==0)
            {
                Bullet b = new Bullet();
                getWorld().addObject(b,getX(),getY());
                b.setRotation(getRotation())  ; 
            }
            count++;
            if(count==10)
            {
                count =0;
            }

        }
        else
        {
            count =0;
        }
        /*if(getX()<=5)
        {
        setLocation(getX()-10,getY());
        }
         */
    }

    public void setLocation(int xposn, int yposn)  
    {  
        int oldX = getX();  
        int oldY = getY();  
        super.setLocation(xposn, yposn);  
        if((!getIntersectingObjects(Obstacle1.class).isEmpty())||(!getIntersectingObjects(HorizontalObstacle.class).isEmpty())||(!getIntersectingObjects(Wall.class).isEmpty()))  
        {  
            super.setLocation(oldX, oldY);  
        }  
    }
    public void damageHealth()
    {
        if(statBar!=null)
        {
            statBar.add(damageCount);
        }
        
         
    }
    public int gethealth()
    {
        return statBar.getValue();
    }

public String toString()
    {
        return "Player";
    }
}
