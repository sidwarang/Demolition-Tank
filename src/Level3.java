import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends BaseLevel
{

    ScoreManager score;
    private int scr = 0;
    private int lscore = 0;
    
    
    public void printDescription() {
        
        scr = lscore;
    }
    
   
    
    public Level3(ScoreManager score)
    {
        super(new LevelData(
            7,          // Total enemies
            2,          // Enemy max health
            1,          // Enemy speed
            2000,         // Enemy value
            "dust.jpg"  // Background image
            ,"Level3"
        ), score);
        super.addChild(this);
        this.score = score;
        BaseLevel.bossPlane=0;
        
        
        for(int i = 1; i<10;i++ )
        {
                addObject(ObstacleFactory.getObstacle("Bush"), randPosition(0,900),randPosition(0,590));
        }
        addObject(new Score(),40,20);
      
    }
    
    public static int randPosition(int min, int max) {

    Random rand = new Random();
    int randomNum = rand.nextInt((max - min) + 1) + min;

     return randomNum;
    }
 
    public void act() {
        
        super.act();
       lscore = getCurrentLevelScore();
        if(isLevelCompleted()) {
          
            super.printDescription();
            score.increaselvlScore(scr);
           
            Greenfoot.setWorld(new GameEnd(getGameScore(),getLevelScore()));
        
        }
        else
        {
            if(getObjects(Tank1.class).isEmpty())
            {
                super.printDescription();
                score.increaselvlScore(scr);
         
                GameOver go = new GameOver();
                int textX = getWidth()/2;
                int textY = getHeight()/2;
                addObject(go, textX, textY);
           
                Greenfoot.setWorld(new GameEnd(getGameScore(),getLevelScore()));
            
            }
       }
    }
}
