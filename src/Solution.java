import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


public class Solution
{
	public BigInteger calculatePermutationIndex(String candidate)
	{
		int[] codes = Strings.encodeCharacters(candidate);
		List<Tuple<Integer>> debts = calculateDebtFractions(codes);
		BigInteger[] populations = calculateDebtPopulations(codes);
		
		BigInteger totalDebt = BigInteger.ZERO;
		
		for (int i = 0; i< debts.size(); i++)
		{
			int numerator = debts.get(i).left;
			int denuminator = debts.get(i).right;
			
			BigInteger delta = populations[i].multiply(BigInteger.valueOf(numerator)).divide(BigInteger.valueOf(denuminator));
			totalDebt = totalDebt.add(delta);
		}
		
		return totalDebt;
	}

	private List<Tuple<Integer>> calculateDebtFractions(int[] codes)
	{
		List<Tuple<Integer>> results = new ArrayList<Tuple<Integer>>();
		
		for (int i = 0; i< codes.length; i++)
		{
			int numerator = inRemainingCountLessThan(codes[i], codes, i+1);
			int denominator = codes.length-i;
			results.add(new Tuple<Integer>(numerator, denominator)); 
		}
		
		return results;
	}
	
	private int inRemainingCountLessThan(int thresholdValue, int[] values, int startingIndex)
	{
		int lessThanCount = 0;
		
		for (int i = startingIndex; i< values.length; i++)
		{
			if (values[i] < thresholdValue)
				lessThanCount++;
		}
		
		return lessThanCount;
	}

	private BigInteger[] calculateDebtPopulations(int[] codes)
	{
		return Permutations.numPermutationsPer(codes);
	}
}
