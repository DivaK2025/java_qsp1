import java.util.*;
class BinaryToDeci 
//without using loop.
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		String binary = sc.nextLine();
		int decimal = Integer.parseInt(binary,2);

		System.out.println(decimal+ " is a Decimal Number");



	}
}


