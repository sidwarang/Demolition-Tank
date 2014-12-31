import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ObstacleFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ObstacleFactory
{
    /**
     * Act - do whatever the ObstacleFactory wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static Actor getObstacle(String str)
    {
       
        if(str.equalsIgnoreCase("Obstacle1"))
        {
            return new Obstacle1();
        }
        else if (str.equalsIgnoreCase("HorizontalObstacle"))
        {
            return new HorizontalObstacle();
        }
        else if (str.equalsIgnoreCase("Bush"))
        {
            return new Bush();
        }
        else if (str.equalsIgnoreCase("Wall"))
        {
            return new Wall();
        }
        else
        {
            return null;
        }
        
    }  
}
