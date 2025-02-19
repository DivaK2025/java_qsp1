import java.util.Scanner;
class NumFind 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		String op = ((num % 2 == 0)&&(num % 5 == 0))?
			        ("HiTwoFive"):((num % 2 == 0)?("HiTwo"):
			        ((num % 5 == 0)?("HiFive"):(" ")));

		System.out.println(op);
	}
}
