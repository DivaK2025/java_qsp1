import java.util.Scanner;
class ConvertPoundsToKg 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter a number in pounds:");

		double pounds = sc.nextDouble();
		double kilograms = pounds*0.45359237;
		
		//System.out.println( kilograms = pounds*0.45359237);
		System.out.println();
	}
}



//no in pounds =55.5
// no in kg =25.174376535