package loop;

public class Pattern {
	public static void main(String[] args)
	{
		char a  = 65;
		for (int i=0; i<=2; i++)
		{
			 
			for (int j=0; j<=i; j++)
			{
				
				System.out.print((char) (a +j)+ " " );
				
			}
			
			
			System.out.println();
		}
	}

}
