import java.util.Scanner;
class  Grade
{
	public static void main(String[] args) 
	{
		System.out.println("enter total marks out of 500");
		float marks=new Scanner(System.in).nextInt();
		float percent=(marks/500)*100;
		 if(percent>=76)
		{
			System.out.println("Destintion");
		}
		else if(percent>=61 && percent<=75)
		{
			System.out.println("First class");
		
		}
		else if(percent>=35 && percent<=60)
		{
			System.out.println("second class");                                                                             

		}
		else if(percent>0 && percent<=35)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("Invaild input");
		}
	}
}

