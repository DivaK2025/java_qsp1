import java.util.Scanner;
class Username 
{
	public static void main(String[] args) 
		throws InterruptedException	
	{   
				
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter your Name:");
			
			String name = sc.next().toUpperCase();

			for(int i =0;i<= name.length()-1;i++)
		{
				System.out.println(name.charAt(i));

				Thread.sleep(2000);
		}


	}
}
