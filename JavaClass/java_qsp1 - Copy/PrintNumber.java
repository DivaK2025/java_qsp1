import java.util.Scanner;
class PrintNumber
	{
    public static void main(String[] args)
		{
		Scanner sc = new Scanner(System.in);

		
        for (int i = 1; i <= 100; i++)
			{
            switch (i) 
				{
                case 1:
                    System.out.println(1);
                    break;
                case 2:
                    System.out.println(2);
                    break;
                case 3:
                    System.out.println(3);
                    break;
                case 4:
                    System.out.println(4);
                    break;
                case 5:
                    System.out.println(5);
                    break

                // Continue for all numbers from 1 to 100
                default:
                    System.out.println(i);
            }
        }
    }
}
