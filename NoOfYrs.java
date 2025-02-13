import java.util.Scanner;
class NoOfYrs 
{
	public static void main(String[]agrs)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of minutes :");

		double min = sc.nextDouble();
		double minutesInYears = 60*24*365;
        long years =(long)(min / minutesInYears);
		int days = (int)(min / 24 / 60)%365;


	System.out.println( min +"minutes is approximately"+years +"years and"+days+"days.");




	}
}


// no of minutes = 1000000000
//1902 yrs 214 days