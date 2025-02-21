import java.util.*;
class NumberToBinary 
//without using loop.
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String binary = Integer.toBinaryString(num);

		System.out.println(binary+ " is a Binary Number");



	}
}
