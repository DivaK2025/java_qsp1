import java.util.Scanner;
class NeonNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum =0;
		int sqr = num*num;


		for(int i =sqr;i>0;i/=10)
			sum += i%10;
		if (sum==num)
		   System.out.println(num+ "is a neon number");
		else
			System.out.println(num+ "is not a neon number");


	}
}
