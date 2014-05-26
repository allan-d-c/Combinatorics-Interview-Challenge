
public class RunnableTimed implements Runnable
{
	private Runnable myRunnable;
	private long myElapsed;

	public RunnableTimed(Runnable runnable)
	{
		myRunnable = runnable;
	}
	
	public void run()
	{
		long start = System.nanoTime();
		myRunnable.run();
		long end = System.nanoTime();
		myElapsed = end-start;
	}
	
	public long elapseNano()
	{
		return myElapsed;
	}
	
	public long elapsedMSec()
	{
		return myElapsed/1000/1000;
	}		
}
