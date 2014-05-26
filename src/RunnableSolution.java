import java.math.BigInteger;


public class RunnableSolution implements Runnable
{
	private String myCandidate;
	private BigInteger myResultingIndex;
	
	public RunnableSolution(String candidate)
	{
		myCandidate = candidate;
	}
	
	@Override
	public void run()
	{
		Solution sol = new Solution();
		myResultingIndex = sol.calculatePermutationIndex(myCandidate);
	}
	
	BigInteger getIndex()
	{
		return myResultingIndex;
	}
}
