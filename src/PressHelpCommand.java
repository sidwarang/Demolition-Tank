/**
 * Write a description of class PressStartCommand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PressHelpCommand implements Command  
{
    Receiver receiver=null;
	public PressHelpCommand(Receiver receiver)
	{
		this.receiver=receiver;
	}
	@Override
	public void execute()
	{
		receiver.pressHelp();
	}
}
