import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * This is a brute force, non-performant method, but it is easy to implement and
 * is useful for generating known-good test case data. This takes up lots of memory
 * and lots of time.
 * 
 */
public class UglyButUsefulBruteForceSolution 
{
	public static void main(String[] args)
	{
		String test = "question";
		Set<String> perms = Permutations.permute(test);

		System.out.println("Test: " + test + "(" + perms.size() + ")");
		
		for (String s : perms)
		{
			System.out.println("\t: " + s);
		}
		
		List<String> ordered = new ArrayList<String>(perms);
		Collections.sort(ordered);

		System.out.println("Sorted:");
		
		for (String s : ordered)
		{
			System.out.println("\t: " + s);
		}
		
		String target = test;
		
		for (int i = 0; i< ordered.size(); i++)
		{
			if (ordered.get(i).equals(target))
			{
				System.out.println("Hit: " + (i+1));
			}
		}
	}
}
