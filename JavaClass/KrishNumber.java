import java.util.Scanner;
class KrishNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = 145; 
        int sum = 0;

        while (num > 0) {
            int rem = num % 10;  
            int fact = 1;

         
            for (int i = 1; i <= rem; i++) {
                fact *= i;  
            }
            
            
            sum += fact;

            
            System.out.println("Krish Number of " + rem + " is: " + fact);

            num /= 10; 
        }
        
        System.out.println("Sum of KrishNumber  of digits: " + sum);
    }
}
