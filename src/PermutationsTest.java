import static org.junit.Assert.*;

import java.math.BigInteger;
import java.util.Set;

import org.junit.Test;


public class PermutationsTest 
{
	private void mustEqual(long expected, BigInteger found)
	{
		assertEquals(expected, found.longValue());
	}

	// ------------
	
	@Test
	public void anEmptyStringHasNoPermutations()
	{
		Set<String> results = Permutations.permute("");
		assertTrue(results.isEmpty());
	}

	@Test
	public void aSingletonHasOnePermutation()
	{
		Set<String> results = Permutations.permute("a");
		assertTrue(results.contains("a"));
		assertEquals(1, results.size());
	}

	@Test
	public void aPairHasTwoPermutations()
	{
		Set<String> results = Permutations.permute("ab");
		assertTrue(results.contains("ab"));
		assertTrue(results.contains("ba"));
		assertEquals(2, results.size());
	}

	@Test
	public void aQuadHasExpectedPermutations()
	{
		Set<String> results = Permutations.permute("acdb");
		assertTrue(results.contains("abcd"));
		assertTrue(results.contains("dcba"));
		assertEquals(24, results.size());
	}

	// ------------

	@Test
	public void emptyStringHasSinglePermutation()
	{
		mustEqual(1, Permutations.numPermutations(""));		
	}
	
	@Test
	public void homogenousStringHasOnlyOnePermutation()
	{
		mustEqual(1, Permutations.numPermutations("aaaa"));
	}
	
	@Test
	public void stringOfSingletonsHasSimpleFactorialPermutationCount()
	{
		mustEqual(40320, Permutations.numPermutations("question"));
	}
	
	@Test
	public void permutationsOfTwoCharactersWorks()
	{
		mustEqual(6, Permutations.numPermutations("abab"));
	}
	
	@Test
	public void permutationsOfSingletonWithRepeatedWorks()
	{
		String[] tests = {"abbb", "ccccccdccccc"};
		
		for(String test : tests)
		{
			mustEqual(test.length(), Permutations.numPermutations(test));
		}
	}

	// ------------

	@Test
	public void singletonArrayHasSinglePermutation()
	{
		int[] test = { 4 };
		assertEquals(1, Permutations.numPermutationsPer(test).length);		
	}
}
