 import java.util.Scanner;
class MonthCalculator
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a months");
		int month = sc.nextInt();

		 int n  = month/12 ;
		 float m = month%12;
		 float k = n+(m/10);

		System.out.println(k);

	
	}
}
