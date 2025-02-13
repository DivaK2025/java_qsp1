import java.util.Scanner;
class Upper
{
	public static void main(String[] args) 
	
	{
		Scanner sc=new Scanner(System.in);

			System.out.println("Enter a character:");
			char ch = 'A';


       String  result = Character .isUpperCase(ch) ? "is UpperCase" : "is LowerCase";

		System.out.println(" the charcter:'" +ch+ "' is:"
			+result);



	}
}
