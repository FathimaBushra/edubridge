package patternsassignment;
import java.util.Scanner;
public class Pattern20 {
/*o/p:
	
	*     * * * *
	*     *
	*     *
	* * * * * * *
    	  *     *
    	  *     *
	* * * *     *
*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = scanner.nextInt();
		int size=n/2+1;
		for (int i = 1; i <= n; i++) 
		{
			for (int j =1; j <= n; j++) 
			{
				if((i<=size) && (j==1))
				{
				System.out.print("*");
			}
				else if((i==size) || (j==size))
				{
				System.out.print("*");
			}
				else if((i==1) && (j>=size))
				{
				System.out.print("*");
			}
				else if((i==n) && (j<=n/2))
				{
				System.out.print("*");
			}
				else if((i>=size) && (j==n))
				{
				System.out.print("*");
			}

					else {
						System.out.print(" ");
					}
				}
			System.out.println();
		}
		scanner.close();

	}
}

