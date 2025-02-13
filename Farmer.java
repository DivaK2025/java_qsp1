 import java.util.Scanner;
class Farmer 
{
	public static void main(String[] args) 
	{
		System.out.println("enter your soil type");
		System.out.println("1.Black Soil");
		System.out.println("2.normal soil");
		System.out.println("3.alluvial Soil");
		int type=new Scanner(System.in).nextInt();
			switch(type)
		{
			case 1:
			{
				System.out.println("you can grow cash crops like Sugarcane,tobacoo,Cotton");
				break;
			}
			case 2:
			{
				System.out.println("you can grow food crops like Wheat,Maize,Millets");
				break;
			}
			case 3:
			{
				System.out.println("you can grow cash crops like Rice  ");
				break;
			}
			default:
			{
				System.out.println("Invaild Input");
				break;
			}
		}

	}
}

