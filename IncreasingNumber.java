import java.util.Scanner;

class IncreasingNumber {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
		boolean isIncreasing = true;

       
        String numStr = Integer.toString(num);
     

      
        for (int i = 0; i < numStr.length() -1; i++) {
			if(numStr.charAt(i)>=numStr.charAt(i+1)){
				 isIncreasing =false;
                break;
            }
		}
        

        
        if (isIncreasing) {
            System.out.println(num + " is an increasing number.");
        } else {
            System.out.println(num + " is not an increasing number.");
        }
    }
}
