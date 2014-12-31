import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class LevelManager here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BaseLevel extends TankWorld implements IScore
{
    private ArrayList<IScore> lvl = new ArrayList<IScore>();
    private ArrayList<Integer> sc = new ArrayList<Integer>();
    private LevelData levelInfo;
    private ScoreManager scoreManager;
    private int enemiesCreated;
    private HealthBar healthBar  = new HealthBar(1000, 1000);
    int count =0;
    static int bossPlane=0;
    private long curTime, prevTime;  
    private static final long DELAY_TIME = 1000;
    public BaseLevel()
    {
        
    }
    
    public BaseLevel(LevelData levelInfo,ScoreManager scoreManager)
    {    
       this.levelInfo = levelInfo;
       this.scoreManager = scoreManager;
       drawBackground();
       
       if(count==0)
       {
       addPlayer();
       addObject(healthBar, 930, 20);
       }
       count =1;
       
    } 
    
    public void act()
    {
        if(!getObjects(Tank1.class).isEmpty())
        {
        addEnemies();
        if(bossPlane==0 && levelInfo.getLevel().equals("Level3"))
        {
            addEnemyPlane();
            bossPlane++;
        }
         isLevelCompleted();
         showText(String.valueOf(scoreManager.getScore()),100,20);
        }
        
    }
    public void drawBackground()
    {
         GreenfootImage baseImage = new GreenfootImage(levelInfo.getBackground());
         setBackground(baseImage);
    }
    
    public void addPlayer()
    {
        Tank1 tank1 =  new Tank1(healthBar);
       addObject(tank1,100,350);
    }
    
    public void addEnemies()
    {
        
        if(enemiesCreated < levelInfo.getNoOfEnemies())
        {
            //Greenfoot.delay(30);
            createEnemy();
        }
        

        

   }
    
   public void addEnemyPlane()
    {
                Plane plane = new Plane(levelInfo.getEnemyHealth(), levelInfo.getEnemySpeed(), levelInfo.getEnemyScore(),levelInfo.getLevel(),scoreManager); 
               int x = Greenfoot.getRandomNumber(getWidth());
               int y = Greenfoot.getRandomNumber(getHeight());
               addObject(plane, x, y);
        
    }
    public void createEnemy()
    {
       int x =0;
        Enemy enemy = new Enemy(levelInfo.getEnemyHealth(), levelInfo.getEnemySpeed(), levelInfo.getEnemyScore(),levelInfo.getLevel(),scoreManager);
        if(levelInfo.getLevel().equalsIgnoreCase("level2"))
        {
            while(!((x=Greenfoot.getRandomNumber(getWidth()))>600))
            {
                x = Greenfoot.getRandomNumber(getWidth());
            }
        }
        
        int y = Greenfoot.getRandomNumber(getHeight());
        addObject(enemy, x, y);
        enemiesCreated++;
    }
    public boolean isLevelCompleted()
    {
        if(enemiesCreated == levelInfo.getNoOfEnemies() && getObjects(Enemy.class).isEmpty())
        {
           return true;
        }
        return false;
    }
    
     public void printDescription() {
        //System.out.println("in print description");
         for(IScore s:lvl)
        {
            //System.out.print(s.getClass().getName());
            s.printDescription();
        }
        
    }
        
    public void addChild(IScore c) {
        //System.out.println(c.getClass().getName());
        lvl.add(c);
    }

    public void removeChild(IScore c) {
        lvl.remove(c);
    }

    public IScore getChild(int i) {
        // no implementation
        return lvl.get(i) ;
    }
    
    public int getNoOfEnemies()
    {
     return (getObjects(Enemy.class).size());  
    }
    
    public int getCurrentLevelScore()
    {
        return (levelInfo.getEnemyScore()*levelInfo.getNoOfEnemies()) -(levelInfo.getEnemyScore()*getNoOfEnemies());
    }
    
    public int getGameScore()
    {
     return scoreManager.getScore();  
    }
    
    public ArrayList<Integer> getLevelScore()
    {
        return scoreManager.getlvlScore();
    }
    
}
