import java.util.Scanner;
class PrintChar
	{
    public static void main(String[] args)
		{
		Scanner sc = new Scanner(System.in);
        char  i = sc.next().charAt(0);
		
        for (char i = A; i <= Z; i++)
			{
            switch (i) 
				{
                case 1:
                    System.out.println(A);
                    break;
                case 2:
                    System.out.println(B);
                    break;
                case 3:
                    System.out.println(C);
                    break;
                case 4:
                    System.out.println(D);
                    break;
                case 5:
                    System.out.println(E);
                    break;

                // Continue for all numbers from A to Z
                default:
                    System.out.println(i);
            }
        }
    }
}
