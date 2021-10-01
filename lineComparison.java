public class lineComparison
{
	public static void main(String args[])
	{

		int x1 = 4, x2 = 8;
		int y1 = 3, y2 = 9;
		
		int a1 = 4, a2 = 8;
		int b1 = 3, b2 = 9;
		
		int length1 = (int) Math.sqrt(((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)));
		int length2 = (int) Math.sqrt(((a2-a1)*(a2-a1) + (b2-b1)*(b2-b1)));

		System.out.println("length of a line: "+length1);
		System.out.println("length of a line: "+length2);
		
		
		if (length1 == length2)
		{
			System.out.println("Lines are Equal-> Length1 : " +length1+ " Length2 : " +length2  );	
		}
		else
		{
			System.out.println("Lines are not Equal");
		}
		
	}

}
