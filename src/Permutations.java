import java.math.BigInteger;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Permutations
{
	public static Set<String> permute(String candidate)
	{
		Preconditions.isNotNull(candidate);

		if (candidate.isEmpty())
			return new HashSet<String>();
		
		Set<String> previous = permute(candidate.substring(1));
		Set<String> results = new HashSet<String>();
		
		if (previous.size() == 0)
		{
			results.add(candidate.substring(0, 1));
		}
		else
		{
			for (String s : previous)
			{
				for (int i = 0; i<= s.length(); i++)
				{
					StringBuilder sb = new StringBuilder(s);
					sb.insert(i, candidate.charAt(0));
					results.add(sb.toString());
				}
			}
		}
		
		return results;
	}
	
	public static BigInteger numPermutations(String candidate)
	{
		Preconditions.isNotNull(candidate);
		
		Map<Character,Integer> counts = Strings.countCharacters(candidate);
		
		int slots = candidate.length();
		BigInteger combinations = Factorial.of(slots);
		
		for (int count : counts.values())
		{
			combinations = combinations.divide(Factorial.of(count));
		}
		
		return combinations;
	}

	public static BigInteger[] numPermutationsPer(int[] codes)
	{
		Preconditions.isNotNull(codes);
		Preconditions.isTrue(codes.length > 0);
		
		Map<Integer,Integer> counts = new HashMap<Integer,Integer>();
		
		for (int i = 0; i< codes.length; i++)
		{
			if(!counts.containsKey(codes[i]))
				counts.put(codes[i], 0);
			counts.put(codes[i], counts.get(codes[i])+1);
		}
		
		BigInteger[] combinations = new BigInteger[codes.length];
	
		for (int i = 0; i< codes.length; i++)
		{
			int digits = codes.length-i;

			BigInteger combos = Factorial.of(digits);
		
			for (int count : counts.values())
			{
				combos = combos.divide(Factorial.of(count));
			}
			
			combinations[i] = combos;
			
			int currentCount = counts.get(codes[i]);
			counts.put(codes[i], currentCount-1);
		}

		return combinations;
	}
}
