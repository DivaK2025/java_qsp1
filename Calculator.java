import java.util.Scanner;
class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter num1:");
		float num1 = sc.nextInt();
		System.out.println("Enter num2:");
		float num2 = sc.nextInt();
		System.out.println("Enter an operator:");
		char op = sc.next().charAt(0);
		float opt = 0;

		opt =(op=='+')?num1+num2:
			 (op=='-')?num1-num2:
			 (op=='*')?num1*num2:
			 (op=='/')?num1/num2:
			 (op=='%')?num1%num2:0.000001F;

		String output =num1+ " "+op+" " +num2  +" "+opt;

		if(!(opt == 0.00000F))
		{
			System.out.println(opt);
		}


	}

	
	
}
