import java.util.Scanner;
class CharCheck
{
	public static void main(String[] args)
		Scanner sc = new Scanner(System.in);
		System.out.prinln("Enter a character:");
		char ch = sc.next().charAt(0);
		
		String result = Character.Digit(ch) ?  "Digit" :
			           Character.UpperCase(ch)? "UpperCase" :
					   Character.LowerCase(ch)? "LowerCase" :  "SpecialCharacter:;
		System.ou.println("the charactetr '" +ch+ "'is a" +result+ ".");
			     

}