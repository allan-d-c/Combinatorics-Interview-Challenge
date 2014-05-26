import java.math.BigInteger;


public class Factorial 
{
	private static final int MAX_HANDLED = 25;
	
	private static BigInteger[] ourFactorials = new BigInteger[MAX_HANDLED+1];
	
	static 
	{
		ourFactorials[0]  = BigInteger.valueOf(1L);
		ourFactorials[1]  = BigInteger.valueOf(1L);
		ourFactorials[2]  = BigInteger.valueOf(2L);
		ourFactorials[3]  = BigInteger.valueOf(6L);
		ourFactorials[4]  = BigInteger.valueOf(24L);
		ourFactorials[5]  = BigInteger.valueOf(120L);
		ourFactorials[6]  = BigInteger.valueOf(720L);
		ourFactorials[7]  = BigInteger.valueOf(5040L);
		ourFactorials[8]  = BigInteger.valueOf(40320L);
		ourFactorials[9]  = BigInteger.valueOf(362880L);
		ourFactorials[10] = BigInteger.valueOf(3628800L);
		ourFactorials[11] = BigInteger.valueOf(39916800L);
		ourFactorials[12] = BigInteger.valueOf(479001600L);
		ourFactorials[13] = BigInteger.valueOf(6227020800L);
		ourFactorials[14] = BigInteger.valueOf(87178291200L);
		ourFactorials[15] = BigInteger.valueOf(1307674368000L);
		ourFactorials[16] = BigInteger.valueOf(20922789888000L);
		ourFactorials[17] = BigInteger.valueOf(355687428096000L);
		ourFactorials[18] = BigInteger.valueOf(6402373705728000L);
		ourFactorials[19] = BigInteger.valueOf(121645100408832000L);
		ourFactorials[20] = BigInteger.valueOf(2432902008176640000L);
		// values below this line overflow long, which is why we are using BigInteger
		ourFactorials[21] = new BigInteger("51090942171709440000");
		ourFactorials[22] = new BigInteger("1124000727777607680000");
		ourFactorials[23] = new BigInteger("25852016738884976640000");
		ourFactorials[24] = new BigInteger("620448401733239439360000");
		ourFactorials[25] = new BigInteger("15511210043330985984000000");
	}
	
	public static BigInteger byLookup (int n)
	{
		Preconditions.areTrue(0 <= n, n <= MAX_HANDLED);
		return ourFactorials[n];
	}
	
	public static BigInteger byIteration (int n)
	{
		Preconditions.areTrue(n <= MAX_HANDLED);
		
		BigInteger result = BigInteger.ONE;
		
		for (int i = 1; i <= n; i++)
		{
			result = result.multiply(BigInteger.valueOf(i));
		}
		
		return result;
	}
	
	public static BigInteger of(int n)
	{
		return (n < ourFactorials.length) ? byLookup(n) : byIteration(n);
	}
}
