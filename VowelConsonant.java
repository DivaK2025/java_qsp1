import java.util.Scanner;
 class VowelConsonant
	 {

    public static void main(String[] args) 
		{

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Charcter:");

		char ch = sc.next().charAt(0);

        String op=(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )?("Wovel"):("Consonant");
           
		System.out.println(op);

    }
}

