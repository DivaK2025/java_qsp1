import java.util.Scanner;
class SumOfDigit
{
	public static void main(String[] args)
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");

		int num = sc.nextInt();
		int sum =0;
		int dup =num;


//[

	//	if( num <= 0 ||  num >=1000)
	//	{
	//		System.out.println("Enter a number between 0 and 1000");
	//	}
	
	//	 while( num >0)
	//	{
	//		 sum += num % 10;
	//		 num /=10;
	//	}
		
		
	//System.out.println("Sum of Digit:" +sum);	
//	]

	


		int digit =num%10; //extract the no
		sum =sum+digit;   //sum the digit using no
		num= num/10;     // remove the last digit using no
		
		digit=num%10;
		sum =sum+digit;
		num= num/10;

		digit =num%10;
		sum =sum+digit;
		num= num/10;
		
	    digit =num%10;
		sum =sum+digit;
		


		



		System.out.println("Sum of Digit :"+sum);
	


	}   
}


//input from user
// no=789
//sod=24