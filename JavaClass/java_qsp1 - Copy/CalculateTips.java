import java.util.Scanner;

class CalculateTips {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Corrected variable name

        System.out.println("Enter the Subtotal:");
        float subtotal = sc.nextFloat(); // Read the subtotal

        System.out.println("Enter the Tip Percentage:");
        float tip = sc.nextFloat(); // Read the tip percentage

        double totalTip = subtotal * (tip / 100); // Calculate the tip amount
        double totalBill = subtotal + totalTip; // Calculate the total bill

        System.out.println("The Tip Amount is: " + totalTip);
        System.out.println("The Total Bill is: " + totalBill); // Display the total bill
    }
}
