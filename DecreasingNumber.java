import java.util.Scanner;

class DecreasingNumber {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
		boolean isDecreasing = true;

      
        String numStr = Integer.toString(num);
     
        for (int i = 1; i < numStr.length() ; i++) {
			if(numStr.charAt(i)>=numStr.charAt(i-1)){
				 isDecreasing =false;
                break;
            }
		}
        

        
        if (isDecreasing) {
            System.out.println(num + " is a decreasing number.");
        } else {
            System.out.println(num + " is not a decreasing number.");
        }
    }
}
