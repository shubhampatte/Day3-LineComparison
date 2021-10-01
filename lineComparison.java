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

		System.out.println("length of a length1 : "+length1);
		System.out.println("length of a length2 : "+length2);
		
		
		Integer line1 = new Integer(length1);
		Integer line2 = new Integer(length2);
		
		System.out.println("length of a line1: "+line1);
		System.out.println("length of a line2: "+line2);
		
		int result = line1.compareTo(line2);
		
		System.out.println("Compare : "+result);
		System.out.println("Equal : "+line1.equals(line2));
		
		if (result > 0)
		{
			System.out.println("Line1 : " +line1+ " is greater than Line2 : " +line2);
		}
		else if (result < 0)
		{
			System.out.println("Line2 : " +line2+ " is greater than Line1 : " +line1);
		}		
		else
		{
			System.out.println("Lines are equal");

		}			
		
	}

}
