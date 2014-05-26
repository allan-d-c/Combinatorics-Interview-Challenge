import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Strings 
{
	public static char[] getChars(String s) 
	{
		char[] results = new char[s.length()];
		
		for (int i = 0; i< results.length; i++)
		{
			results[i] = s.charAt(i);
		}
		
		return results;
	}
		
	public static Map<Character,Integer> countCharacters(String candidate)
	{
		Map<Character,Integer> counts = new HashMap<Character,Integer>();
		
		for (char ch : getChars(candidate))
		{
			if (!counts.containsKey(ch))
				counts.put(ch, 0);
		
			counts.put(ch, counts.get(ch)+1);
		}
		
		return counts;
	}
	
	public static List<Character> sortedUniqueCharacters(String candidate)
	{
		Set<Character> found = new HashSet<Character>();

		for (char ch : getChars(candidate))
		{
			found.add(ch);
		}
		
		List<Character> sorted = new ArrayList<Character>(found);
		Collections.sort(sorted);
		return sorted;
	}
	
	public static int[] encodeCharacters(String candidate)
	{
		List<Character> chars = sortedUniqueCharacters(candidate);
		Map<Character,Integer> map = buildPositionalMap(chars);
		
		int[] result = new int[candidate.length()];
		
		for (int i = 0; i< candidate.length(); i++)
		{
			result[i] = map.get(candidate.charAt(i));
		}
		
		return result;
	}

	public static Map<Character, Integer> buildPositionalMap(List<Character> uniqueChars) 
	{
		Map<Character, Integer> results = new HashMap<Character, Integer>();	
		
		for (int i = 0; i< uniqueChars.size(); i++)
		{
			results.put(uniqueChars.get(i), i);
		}
		
		return results;
	}

}
