import java.util.Scanner;
class SpyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		
		int  num = sc.nextInt();

		int sum = 0;
		int product = 1;
		int id;

		 while (num > 0) { 
            id = num % 10; 
              sum += id; 
            product = product* id; 
            num = num / 10; 
        } 
		if (sum == product)

			System.out.println(num+" is a Spy Number.");
		else
			System.out.println(num+ "is a not Spy Number.");
	}
}
