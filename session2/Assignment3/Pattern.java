public class Pattern {
	
	public static void main(String[] args)
	{
		
		int length = 5;
		//int k = length;
		for(int i = 1; i <= length ; i++)
		{
			for(int j = 1 ; j<= i ; j++)
			{
			
					System.out.print(j + " ");
				
			}
			System.out.println();
		}
		
		for(int i = length-1; i >= 1 ; i--)
		{
			for(int j = 1 ; j<= i ; j++)
			{
			
					System.out.print(j + " ");
				
			}
			System.out.println();
			length --;
		}
	}

}
