import java.util.Scanner;
class Cylinder 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a radius of cylinder:");
		System.out.println("Enter a height of cylinder:");

		double r =sc.nextDouble();
		double h =sc.nextDouble();
		
		 
			
		double pie = 3.14;

		double area = 3.14*r*r;
		double volume = area*h;

		System.out.println("Area of cylinder =" +area);
		System.out.println("Volume of Cylinder =" +volume);
	}
}


//(Que.compute Area and Volume of cylinder using given formulas).
//r=5.5
//h=12
//Area = 94.985
//Volume =1139.82