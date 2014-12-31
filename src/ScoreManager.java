import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class ScoreManager here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreManager implements IObserver 
{
    private int max_score = 16000;
    private int score;
    private String lvlScore;
    private ArrayList<Integer> lscore = new ArrayList<Integer>();
    public int getScore()
    {
        //System.out.println(score);
        return score;
    }
    public void increaseScore(int tempScore)
    {
        score = score + tempScore;
    }
    public void updateScore(int tempScore)
    {
        score = score + tempScore;
    }
    public ArrayList<Integer> getlvlScore()
    {
        //System.out.println(lvlScore);
        return lscore;
    }
    public void increaselvlScore(int temp)
    {
        //lvlScore = lvlScore + temp;
        lscore.add(temp);
        //System.out.println(lvlScore);
    }

    public void printlvlScore()
    {
        for(Integer i : lscore){
            System.out.println(i);
        }
    }
    
    public int getMaxScore()
    {
        return max_score;
    }
}
