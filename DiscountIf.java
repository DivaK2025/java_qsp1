import java.util.Scanner;
 class DiscountIf 
	 {
   public static void main(String[] args) 
	   { 
	double price, discount;

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter original price:");

	price = sc.nextDouble();
	if (price >= 3000) 
	       {
		discount = price * 0.1; // formula for the discount

		System.out.println("Discount = " + discount);
		price = price - discount; // condition for the price - discount.
	       }
		   {
    	System.out.println("Amount to be paid = " + price); 
		   }
}
}
