import java.util.Scanner;
class PerimeterOfRectangle 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		double h = 7.9;
		double w = 4.5;

		double area = w*h;
		double perimeter = 2*(h+w);


		System.out.println("Area of rectangle =" +area);
		System.out.println("Perimeter of rectangle =" +perimeter);
	}
}


//(Que.Write a program that displays the area and perimeter of a rectangle with the width of 4.5 and height of 7.9 ).
//Area of rectangle =35.550000000000004.
//Perimeter of rectangle = 24.8.