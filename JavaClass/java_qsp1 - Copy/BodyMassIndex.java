import java.util.Scanner;
class BodyMassIndex
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the weight in pounds:");
		double weight = sc.nextDouble();

		System.out.println("Enter the Height in inches:");
		double height = sc.nextDouble();

		double kilograms = weight*0.45359237;
		

		double meter= height*0.0254;
		

		double  BMI = ( kilograms/ meter*  meter);
		System.out.println("Body Mass Index is" +BMI+ "\n");



	}
}




// weight in pounds = 452
// height in inches = 72
// BODY MASS INDEX = 205.02375124000002