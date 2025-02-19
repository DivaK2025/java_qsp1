import java.util.Scanner;
class Temprature 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Degree in celcius :");

	   int cel = sc.nextInt();

		Float fah =(cel*9.0f/5.0f)+32.0f;

		System.out.println(cel+ "Celcius is"+fah+" Farenheit");
	}
}
