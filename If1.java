import java.util.Scanner;
class If1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you scholarship student:");
		String ip = sc.nextLine();

		if(ip.equals("No"))
		{
			System.out.println("Pay the fees");
		}
		
		{
			System.out.println("Attend the school");
		}

	}
}
