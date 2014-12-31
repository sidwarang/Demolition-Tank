import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelData here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelData 
{
    private int noOfEnemies; // Number of enemies in a level
    private int enemyHealth; // Health of enemies
    private int enemySpeed;  // Speed at which the enemy moves
    private int enemyScore;  // Score that the player earns on killing the enemy
    private String background; //background image for that level
    private String level;      // level of the game
    public LevelData(int noOfEnemies, int enemyHealth, int enemySpeed ,int enemyScore, String background,
    String level)
    {
        this.noOfEnemies = noOfEnemies;
        this.enemyHealth = enemyHealth;
        this.enemySpeed = enemySpeed;
        this.enemyScore = enemyScore;
        this.background = background; 
        this.level = level;
    }
    public int getNoOfEnemies()
    {
        return noOfEnemies;
    }
    public int getEnemyHealth()
    {
        return enemyHealth;
    }
    public int getEnemySpeed()
    {
        return enemySpeed;
    }
    public int getEnemyScore()
    {
        return enemyScore;
    }
    public String getBackground()
    {
        return background;
    }
     public String getLevel()
    {
        return level;
    }
}
