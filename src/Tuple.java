
public class Tuple<T> 
{
	T left;
	T right;
		
	public Tuple(T left, T right)
	{
		this.left = left;
		this.right = right;
	}
	
	@Override
	public String toString()
	{
		return "("+left+","+right+")";
	}
}
