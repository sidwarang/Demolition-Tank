/**
 * Write a description of class PressStartCommand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PressStartCommand implements Command  
{
    Receiver receiver=null;
	public PressStartCommand(Receiver receiver)
	{
		this.receiver=receiver;
	}
	@Override
	public void execute()
	{
		receiver.pressStart();
	}
}
