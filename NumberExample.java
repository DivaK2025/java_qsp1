import java.util.Scanner;
class NumberExample 
{
	public static void main(String[] args) 
	{
       System.out.println("Enter a string:");
	   Scanner sc = new Scanner(System.in);
//num is inti
	   int num =sc. nextInt();
	   int dup=num;
	   int sum =0;
	  
	  while(num>0)    //condition
		{
		  int rem = num%10;    //last digit
		  if(rem%2==0);        //for even sum
		  sum+=rem;
		  num/=10;           //update by removing the last digit
	}
	System.out.println(sum);
	System.out.println(dup);
		
		 
}
}