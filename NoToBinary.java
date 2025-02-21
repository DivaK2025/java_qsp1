import java.util.*;
class NoToBinary
//Using loop

{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number:");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String binary = "";

		while(num>0)
		{
			binary = (num%2)+binary;
			num/=2;
		}
		System.out.println(binary+ " is Binary number");

	}
}
