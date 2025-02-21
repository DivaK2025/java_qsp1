import java.util.*;
class BouncyNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String numStr = Integer.toString(num);
		boolean isIncreasing = false;
		boolean isDecreasing = false;

		for (int i = 1; i < numStr.length() ; i++) {
			if(numStr.charAt(i)>=numStr.charAt(i-1)){
				 isIncreasing =true;

			} else if(numStr.charAt(i)<numStr.charAt(i-1)){
				 isDecreasing =true;
			}
		}

		if(isIncreasing && isDecreasing){
			System.out.println(num+ " is BouncyNumber");
			return;
		} 
		else{
			System.out.println(num+ " is not a BouncyNumber");
		}




	}
}
