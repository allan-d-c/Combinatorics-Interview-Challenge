
/**
 * Note there is a Guava class like that to use instead of rolling our own version
 *
 */
public class Preconditions 
{
	static void isTrue(boolean condition)
	{
		if (!condition)
			throw new IllegalArgumentException("Precondition: is-true violation");
	}

	static void areTrue(boolean... conditions)
	{
		StringBuilder sb = new StringBuilder();
		
		for (boolean condition : conditions)
		{
			if (!condition)
			{
				sb.append("F");
				throw new IllegalArgumentException("Precondition: are-true violation " + sb);
			}
			
			sb.append("T ");
		}
	}

	public static void isNotNull(Object candidate)
	{
		if (candidate == null)
			throw new IllegalArgumentException("Precondition: is-not-null violation");
	}

	public static void areNotNull(Object... candidates)
	{
		StringBuilder sb = new StringBuilder();

		for (Object candidate : candidates)
		{
			if (candidate == null)
			{
				sb.append("0");
				throw new IllegalArgumentException("Precondition: are-not-null violation " + sb);
			}
			
			sb.append("!0 ");
		}
	}
}
