import java.util.ArrayList;
/**
 * Write a description of class ISubject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CompositeScore implements IScore
{
    private ArrayList<IScore> components = new ArrayList<IScore>()  ;
    private String description ;
    
    public CompositeScore ( String d )
    {
        description = d ;
    }

	public void printDescription() {
        System.out.println( description );
        for (IScore obj  : components)
        {
            obj.printDescription();
        }
    }
    
    

	public void addChild(IScore c) {
        components.add( c ) ;
	}
	 
	public void removeChild(IScore c) {
        components.remove(c) ;
	}
	 
	public IScore getChild(int i) {
	    return components.get( i ) ;
	}
	 

}
