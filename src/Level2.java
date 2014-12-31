import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends BaseLevel
{

   ScoreManager score;
   
   
    private int scr =0;
    private int lscore = 0;
    
    public void printDescription() {
        
        scr = lscore;
    }
    
    public Level2(ScoreManager score)
    {
        super(new LevelData(
            5,          // Total enemies
            2,          // Enemy max health
            1,          // Enemy speed
            1000,         // Enemy value
            "space1.jpg"  // Background image
            ,"Level2"
        ), score);
        super.addChild(this);
        this.score = score;
        
        for(int i = 1; i<17;i++ )
        {
        addObject(ObstacleFactory.getObstacle("Wall"), 508,(36*i));
        }
        addObject(new Score(),40,20);

    }
    
    public void act() {
        
        super.act();
        lscore = getCurrentLevelScore();
        if(isLevelCompleted()) {

            super.printDescription();
            score.increaselvlScore(scr);
            Greenfoot.setWorld(new Level3(score));
            
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
