import java.util.Scanner;
class Lower
{
	public static void main(String[] args) 
	
	{
		Scanner sc=new Scanner(System.in);

			System.out.println("Enter a character:");
			//char ch = sc.next().charAt(0);
              char ch = 'a';

       String  result = Character .isUpperCase(ch) ? "is UpperCase ":"is LowerCase";

		System.out.println(" the charcter:'" +ch+ "' is:"
			+result);


	}
}
