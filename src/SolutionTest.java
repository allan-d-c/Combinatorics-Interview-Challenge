import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Test;


public class SolutionTest 
{
	@Test
	public void ABAB()
	{
		Solution sol = new Solution();
		BigInteger index = sol.calculatePermutationIndex("ABAB");
		assertTrue(BigInteger.valueOf(2).equals(index.add(BigInteger.ONE)));
	}
	
	@Test
	public void AAAB()
	{
		Solution sol = new Solution();
		BigInteger index = sol.calculatePermutationIndex("AAAB");
		assertTrue(BigInteger.valueOf(1).equals(index.add(BigInteger.ONE)));
	}	
	
	@Test
	public void BAAA()
	{
		Solution sol = new Solution();
		BigInteger index = sol.calculatePermutationIndex("BAAA");
		assertTrue(BigInteger.valueOf(4).equals(index.add(BigInteger.ONE)));
	}
	
	@Test
	public void BOOKS()
	{
		Solution sol = new Solution();
		BigInteger index = sol.calculatePermutationIndex("BOOKS");
		assertTrue(BigInteger.valueOf(6).equals(index.add(BigInteger.ONE)));
	}
	
	@Test
	public void QUESTION()
	{
		Solution sol = new Solution();
		BigInteger index = sol.calculatePermutationIndex("QUESTION");
		assertTrue(BigInteger.valueOf(24572L).equals(index.add(BigInteger.ONE)));
	}
	
	@Test
	public void BOOKKEEPER()
	{
		Solution sol = new Solution();
		BigInteger index = sol.calculatePermutationIndex("BOOKKEEPER");
		assertTrue(BigInteger.valueOf(10743L).equals(index.add(BigInteger.ONE)));
	}
	
	@Test
	public void AVERYLONGLONGVERYONE()
	{
		Solution sol = new Solution();
		BigInteger index = sol.calculatePermutationIndex("AVERYLONGLONGVERYONE");
		assertTrue(BigInteger.valueOf(14145382905576L).equals(index.add(BigInteger.ONE)));
	}
		
	@Test(timeout=500)
	public void maximumExpectedInputMustMeetPerformanceRequirement()
	{
		Solution sol = new Solution();
		BigInteger index = sol.calculatePermutationIndex("ABCDEFGHIJKLMNOPQRSTUVWXY");
		assertTrue(BigInteger.ONE.equals(index.add(BigInteger.ONE)));
	}	
}
