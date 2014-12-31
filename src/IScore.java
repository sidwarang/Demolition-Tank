/**
 * Write a description of class ISubject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface IScore  
{
     void printDescription() ;
     void addChild(IScore c);
     void removeChild(IScore c);
     IScore getChild(int i);
}
