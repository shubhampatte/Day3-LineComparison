public class lineComparison
{
	public static void main(String args[])
	{

		int x1 = 4, x2 = 8;
		int y1 = 3, y2 = 9;
		
		int length = (int) Math.sqrt(((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)));
		System.out.println("length of a line: "+length);
	}

}
