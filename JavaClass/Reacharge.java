import java.util.Scanner;
class Recharge 
{
	public static void main(String[] args) 
	{
		System.out.println("**WElcome***");
		System.out.println("Choose the packs you need to recharge with ");
		System.out.println(" 1. 350 rs(3.5Gb Data a unlimited talk time)" );
		System.out.println(" 2. 250 rs(2.5Gb Data a unlimited talk time)" );
		System.out.println(" 3 .150 rs(1.5Gb Data a unlimited talk time)" );
		int recharge =new Scanner(System.in).nextInt() ;
		switch(recharge)
		{
			case 1:
			{
				System.out.println("enjoy your 3.5Gb Data a unlimited talk time ");
				break;
			}
				case 2:
			{
				System.out.println("enjoy your 2.5Gb Data a unlimited talk time ");
				break;
			}
				case 3:
			{
				System.out.println("enjoy your 1.5Gb Data a unlimited talk time ");
				break;
			}
			default :
			{
				System.out.println("Invaild choice ");
				break;
			}
			
		}
	}
}