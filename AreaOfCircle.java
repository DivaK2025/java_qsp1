import java.util.Scanner;
class AreaOfCircle
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		//System.out.println("Enter raduis of circle :");
		

		//double r=sc.nextFloat();

		double r = 5.5;

		double pie = 3.147;

		double area = pie*(r*r);

		double perimeter =2*(pie)*r;

		
		
		System.out.println("Area of circle =" +area);
		System.out.println("Perimeter of circle=" +perimeter);
	}
	
		
}


// (Que.Writ a program that displays the area and perimeter of a circle that has raduis of 5.5 )
//Area of circle =95.19675.
//Perimeter of circle =34.617.