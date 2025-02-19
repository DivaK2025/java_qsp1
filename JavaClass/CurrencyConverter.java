import java.util.Scanner;
class CurrencyConverter
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("    CURRENCY CONVERTER   ");
		System.out.println(" Enter the amount in (INR) :");
		float inr = sc.nextFloat();

		System.out.println("LIST OF CURRENCY");

		System.out.println("1.USD");
		System.out.println("2.EUR");
		System.out.println("3.GBP");
		System.out.println("4.PKR");

		String curr = sc.next().toUpperCase();
		float conv = 0.0f;

		if(curr.equals("USD")){
			conv = inr/86.56f;
			System.out.println(inr + "INR is equals to" + conv);

	}
	else if(curr.equals("EUR")){
		conv = inr/90.29f;
		System.out.println(inr + "INR is equals to" + conv);
	}
	else if(curr.equals("GBP")){
		conv = inr/107.68f;
		System.out.println(inr + "INR is equals to" + conv);
	}
	else if(curr.equals ("PKR")){
		conv = inr/0.31f;
		System.out.println(inr + "INR is equals to" + conv);
	}
	else{
		System.out.println("Invalid Output");
	}
		
}
}
