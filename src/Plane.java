import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plane extends Actor implements ISubject
{
    private int fireCount =0;
    private int enemyHealth; 
    private int enemySpeed;  // Speed at which the enemy moves
    private int enemyScore;  // Score that the player earns on killing the enemy
    private int moveCount =0;
    private String level;
    private IMoveStrategy moveStrategy;
    private ScoreManager scoreManager;
    public Plane(int enemyHealth, int enemySpeed, int enemyScore, String level, ScoreManager scoreManager)
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
    public Plane()
    {
    }

    public void act() 
    {

        if(isPlayerAlive())
        {
  
            moveRandom();
            fire(); 
            fire(); 
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
         move(enemySpeed*2); 
             
        if(isAtEdge())
        {
            turn(5);
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
        return "BOSS";
    }
}
