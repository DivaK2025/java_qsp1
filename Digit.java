import java.util.Scanner;
class Digit
{
	public static void main(String[] args) 
	
	{
		Scanner sc=new Scanner(System.in);

			System.out.println("Enter a integer:");
			char ch = '8';


         String result = Character .isDigit(ch) ? "is Digit" : "is NoDigit";

		System.out.println(" the charcter:'" +ch+ "' is:"	+result);


	}
}
