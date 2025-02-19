import java.util.Scanner;
class EvenOdd1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number :");
		
		int num = sc.nextInt();

		System.out.println(num%2); // modulus method

		//Bitwise method

		if((num & 1) == 0) 
		{
		System.out.println( num + "is Even");
		} 
		else 
		{
		System.out.println(num + " is odd");
		}
	}

}

// modulus
//input=2 =0
//input =9 = 1

// Bitwise 
//Input =2
//no is even
//input =7
// no is odd
