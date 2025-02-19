import java.util.Scanner;
class BuzzNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int  num =  sc.nextInt();

		if(num%7==0 || num%10==7)
		
			System.out.println(num+ " is a Buzz Number.");

			else
				System.out.println(num+ "is not a  Buzz Number.");

		
		
	}
}
