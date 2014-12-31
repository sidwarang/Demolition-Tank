import greenfoot.*;
import java.awt.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level1 extends BaseLevel
{

    ScoreManager score;
    
    
    private int scr = 0;
    private int lscore = 0;
    public void printDescription() {
      
        scr  = lscore;
    }
 
    
    public Level1(ScoreManager score)
    {
        super(new LevelData(
            2,          // Total enemies
            2,          // Enemy max health
            1,          // Enemy speed
            500,         // Enemy value
            "space1.jpg"  // Background image
            ,"Level1"
        ), score);
        super.addChild(this);
        this.score = score;
        
        addObject(new HorizontalObstacle(),0,200);
        addObject(new Obstacle1(), 600,80);
        addObject(new Obstacle1(), 300,530);
        addObject(new Obstacle1(), 800,530);
        addObject(new Score(),40,20);
        

        addObject(ObstacleFactory.getObstacle("HorizontalObstacle"),0,200);
        addObject(ObstacleFactory.getObstacle("Obstacle1"), 600,80);
        addObject(ObstacleFactory.getObstacle("Obstacle1"), 300,530);
        addObject(ObstacleFactory.getObstacle("Obstacle1"), 800,530);
       
    }
    
    public void act() {
        
        super.act();
        lscore=getCurrentLevelScore();
        if(isLevelCompleted()) {
     
            super.printDescription();
            score.increaselvlScore(scr);
        
            Greenfoot.setWorld(new Level2(score));
           
        }
        else
        {
            if(getObjects(Tank1.class).isEmpty())
            {
                
                super.printDescription();
                score.increaselvlScore(scr);
         
               
                Greenfoot.setWorld(new GameEnd(getGameScore(),getLevelScore()));
             
            
            }
        }
    }
    
    
   

    
}
