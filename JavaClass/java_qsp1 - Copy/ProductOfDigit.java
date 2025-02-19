import java.util.Scanner;
class ProductOfDigit
{
	public static void main(String[] args)
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");

		int num = sc.nextInt();
		int product=1;

		 int digit=num%10;
		  product =product*digit;
		  num= num/10;

		  digit=num%10;
		  product =product*digit;
		  num= num/10;

		  digit=num%10;
		  product =product*digit;
		  num= num/10;

		  digit=num%10;
		  product =product*digit;
		  num=num/10;


		System.out.println("Product Of Digits:"+product);
	


	}   
}


