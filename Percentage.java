import java.util.Scanner;
class  Percentage 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  the marks:");// Marks out of 600 

		float marks =sc.nextFloat();
		float perc = (marks*100)/600; // Formula
	
	// grade determine by the percentage

		String op = (perc>=75)?"Grade A with "+perc+"%":
					(perc>=60)?"Grade B with"+perc+"%":
					(perc>=35)?"Grade C with"+perc+"%":
			         " Failed";

		System.out.println(op);

	}
}
