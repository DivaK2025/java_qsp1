import java.util.Scanner;
class EvenOdd
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no:");
		int num = sc.nextInt();

		System.out.println((num/2)*2 == num); //integer
		System.out.println((num/2.0)*2.0 == num); //decimal
		System.out.println();
		

	
	}
}



// input=9
//output int = false
//o/p= decimal=true      //for Odd No

//input=2
//output int = true
// output decimal=true    //for Even No