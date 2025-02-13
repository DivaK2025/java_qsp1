import java.util.Scanner;

class TableCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        
        System.out.println("Enter the range: ");
        int range = sc.nextInt();
        
        // Loop through the range and print the multiplication table
        for (int i = 1; i <= range; i++) 
			{  // i starts from 1 and goes till the range

            System.out.println(num + " X " + i + " = " + (num * i));  // Corrected multiplication logic
        }
        

    }
}
