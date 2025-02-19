import java.util.Scanner;

class FactorialDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = 123456; 
        int sum = 0;

        while (num > 0) {
            int rem = num % 10;  // last digit
            int fact = 1;

         // calculate fact
            for (int i = 1; i <= rem; i++) {
                fact *= i;  // fact*i
            }
            
            // add fact to digit to the sum
            sum += fact;

            
            System.out.println("Factorial of " + rem + " is: " + fact);

            num /= 10; // remove last digit
        }
        
        System.out.println("Sum of factorials of digits: " + sum);
    }
}
