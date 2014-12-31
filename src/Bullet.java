import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    int bulletTime = 0;
    public Bullet()
    {
        //GreenfootImage bulletImage = getImage();  
        //bulletImage.scale(bulletImage.getWidth() - 20, bulletImage.getHeight() - 20);  
        //setImage(bulletImage);
    }

    public void act() 
    {
        killEnemy();

        
    }   

    public void killEnemy()
    {
        Wall wall;
        wall = ((Wall)(getOneObjectAtOffset(0, 0, Wall.class)));

        Enemy enemyTank;
        enemyTank = ((Enemy)(getOneObjectAtOffset(0, 0, Enemy.class)));

        if(enemyTank !=null)
        {
            enemyTank.reduceHealth();
            if(enemyTank.getEnemyHealth()==0)
            {
                getWorld().addObject(new Explosion(),getX(),getY());
                enemyTank.notifyScoreManager();
                getWorld().removeObject(enemyTank);
                getWorld().removeObject(this);
                
            }
            else
            {
                
                enemyTank = null;
                getWorld().removeObject(this);     
            }

        }
        else
        {
            bulletTime++;
            move(7);
            if(getX()<=2 || getX() > getWorld().getWidth()-2||getY()<=2|| getY()>getWorld().getHeight()-2 || bulletTime==100 ||
            (!getIntersectingObjects(Obstacle1.class).isEmpty())||(!getIntersectingObjects(HorizontalObstacle.class).isEmpty()))
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
        return "Player Bullet";
    }

}
