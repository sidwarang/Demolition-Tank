import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyBullet extends Actor
{
    int bulletTime=0;
    public EnemyBullet()
    {
        GreenfootImage img = getImage();
        img.scale(img.getWidth()-8,img.getHeight()-8);
        setImage(img);
    }

    public void act() 
    {
        Tank1 tank;
        tank = ((Tank1)(getOneObjectAtOffset(0, 0, Tank1.class)));
        Actor wall;
        wall = getOneObjectAtOffset(0, 0, Wall.class);

        
        if(tank !=null)
        {
            tank.damageHealth();
            if(tank.gethealth()==0)
            {
                getWorld().addObject(new Explosion(),getX(),getY());
                getWorld().removeObject(tank);
                getWorld().removeObject(this);
                
            }
            else
            {
                
                tank = null;
                getWorld().removeObject(this);     
            }
           
        }
        else
        {
            bulletTime++;
            move(5);
            if(getX()<=2 || getX() > getWorld().getWidth()-2||getY()<=2|| getY()>getWorld().getHeight()-2 || bulletTime==100 ||
            (!getIntersectingObjects(Obstacle1.class).isEmpty()) || (!getIntersectingObjects(HorizontalObstacle.class).isEmpty()))
            {
                getWorld().removeObject(this);
            }
            if(wall!=null)
            {
                getWorld().addObject(new Explosion(),getX(),getY());
                getWorld().removeObject(wall);
                getWorld().removeObject(this);
            }
        }

    }   
    public String toString()
    {
        return "Enemy Bullet";
    }
}
