import static org.junit.Assert.*;

import org.junit.Test;


public class FactorialTest 
{
	@Test
	public void factorialOf1()
	{		
		assertEquals(1, Factorial.of(1));
	}

	@Test
	public void factorialOf3()
	{		
		assertEquals(6, Factorial.of(3));
	}

	@Test
	public void factorialOf10()
	{		
		assertEquals(3628800, Factorial.of(10));
	}
	
	@Test
	public void bothIterativeAndLookupShouldAgree()
	{
		assertEquals(Factorial.byLookup(1), Factorial.byIteration(1));
		assertEquals(Factorial.byLookup(5), Factorial.byIteration(5));
		assertEquals(Factorial.byLookup(20), Factorial.byIteration(20));
		assertEquals(Factorial.byLookup(25), Factorial.byIteration(25));
	}
}
