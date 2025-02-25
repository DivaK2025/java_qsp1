import java.util.Scanner;

public class SunnyNumber {
    
   
   public static boolean isSunnyNumber(int num) {
       
        int numPlusOne = num + 1;
        
       
        double sqrt = Math.sqrt(numPlusOne);
        
       
        return sqrt == Math.floor(sqrt); 
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        
    
        if (isSunnyNumber(num)) {
            System.out.println(num + " is a Sunny number.");
        } else {
            System.out.println(num + " is not a Sunny number.");
        }
       
    }
}
