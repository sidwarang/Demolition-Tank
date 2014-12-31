import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor implements ISubject
{
    private int fireCount =0;
    private int enemyHealth; // Health of enemies
    private int enemySpeed;  // Speed at which the enemy moves
    private int enemyScore;  // Score that the player earns on killing the enemy
    private int moveCount =0;
    private String level;
    private IMoveStrategy moveStrategy;
    private ScoreManager scoreManager;
    public Enemy(int enemyHealth, int enemySpeed, int enemyScore, String level, ScoreManager scoreManager)
    {
        this.enemySpeed = enemySpeed;
        this.enemyHealth = enemyHealth;
        this.enemyScore = enemyScore; 
        this.level = level;
        this.scoreManager = scoreManager;
        GreenfootImage img = getImage();
        img.scale(img.getWidth()-10,img.getHeight()-10);
        setImage(img);
    }
    
    
    public Enemy()
    {
        
    }
    public void act() 
    {

        if(isPlayerAlive())
        {
            if(level.equalsIgnoreCase("Level1"))
            {
               changeStrategy(new FollowStrategy());
               moveStrategy.move(this);
            }
            else if(level.equalsIgnoreCase("Level2"))
            {
               changeStrategy(new RandomMoveStrategy());
               moveStrategy.move(this);
            }
            else if(level.equalsIgnoreCase("Level3"))
            {
               changeStrategy(new RandomMoveStrategy());
               moveStrategy.move(this);
            }
            
            fire(); 
        }

    }    

    public boolean isPlayerAlive()
    {
        return(!getWorld().getObjects(Tank1.class).isEmpty());
    }

    private void fire()
    {

        if(fireCount ==0)
        {
            EnemyBullet b = new EnemyBullet();
            getWorld().addObject(b,getX(),getY());
            b.setRotation(getRotation())  ; 
        }
        fireCount++;
        if(fireCount==150)
        {
            fireCount =0;
        }

    }
    public void followPlayersMotion()  
    {  
        int dist = 1000;  
         Actor tank = null;
        if(!getObjectsInRange(dist, Tank1.class).isEmpty())  
        {  
            for (Object obj: getObjectsInRange(dist, Tank1.class))  
            {  
                 tank = (Actor) obj;  
                int tankDist = (int) Math.hypot(tank.getX() - getX(), tank.getY() - getY());  
                if (tankDist< dist)  
                {  
                    dist = tankDist;  
                }  
            }  
            turnTowards(tank.getX(),tank.getY()); 
            move(enemySpeed);
        }
        /*if((!getIntersectingObjects(Obstacle1.class).isEmpty())||
           (!getIntersectingObjects(HorizontalObstacle.class).isEmpty())||
           (!getIntersectingObjects(Wall.class).isEmpty()))  
        {  
            super.setLocation(getX(), getY());  
            turn(270);
            move(4);

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
            super.setLocation(oldX-10, oldY-10); 
            //move(3);
        }  
    }


    public int getEnemyHealth()
    {
        return enemyHealth;
    }

    public int getEnemyScore()
    {
        return enemyScore;
    }

    public void reduceHealth()
    {
        enemyHealth = enemyHealth - 1;
    }
    public void moveRandom()
    {
        int dist = 1000;  
         Actor tank = null;
        if(!getObjectsInRange(dist, Tank1.class).isEmpty())  
        {  
            for (Object obj: getObjectsInRange(dist, Tank1.class))  
            {  
                 tank = (Actor) obj;  
                int tankDist = (int) Math.hypot(tank.getX() - getX(), tank.getY() - getY());  
                if (tankDist< dist)  
                {  
                    dist = tankDist;  
                }  
            }  
            turnTowards(tank.getX(),tank.getY()); 
            move(enemySpeed);
        }
        if((!getIntersectingObjects(Obstacle1.class).isEmpty())||
           (!getIntersectingObjects(HorizontalObstacle.class).isEmpty())||
           (!getIntersectingObjects(Wall.class).isEmpty()))  
        {  
            super.setLocation(getX(), getY());  
            turn(270);
            move(-10);

        }
    }
    public void changeStrategy(IMoveStrategy s)
    {
        moveStrategy = s;
    }
    public void notifyScoreManager()
    {
        scoreManager.updateScore(enemyScore);
    }
    public String toString()
    {
        return "Enemy";
    }
}
