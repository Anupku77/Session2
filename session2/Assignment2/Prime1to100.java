
public class Prime1to100 {

	public static void main(String[] args) {
		System.out.println("Prime number from 1 to 100 are");
		/*Starting the loop from 2: as 1 is neither prime nor composite*/
		for(int number = 2; number <= 100 ; number++)
		{   
			int count =0;
			/*Starting the loop from 2: as every number is divisible is by 1
			 *                           so need to check that
			 * Terminating the loop @ half of the number: if the number is not divisible
			 *                                            till its half then the number is 
			 *                                             not divisible by any further number*/
			for(int i = 2; i<= number/2 ; i++)
			{
				if(number % i == 0)
				{
					count =1;
					break;
				}
			}
			if(count == 0)
			{
				System.out.print(number + " ");
			}
		}

	}

}
