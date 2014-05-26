import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class Main
{
	public static void main(String[] args)
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		while (true)
		{			
			try 
			{
				System.out.print("Enter candidate string (ENTER or Q to quit): ");
				
				String candidate = input.readLine(); // throws
				if (candidate.isEmpty() || candidate.toLowerCase().equals("q"))
					break;
				
				RunnableSolution sol = new RunnableSolution(candidate);
				RunnableTimed timed = new RunnableTimed(sol);
				timed.run();
				
				String position = sol.getIndex().add(BigInteger.ONE).toString();
				long elapsed = timed.elapsedMSec();
				
				System.out.println("Found solution in position " + position + " (in " + elapsed + " msec)");
				System.out.println();
			}
			catch (IOException ioe) 
			{
				ioe.printStackTrace();
				System.exit(1);
			}
		}
		
		System.out.println("Quitting");
	}
}
