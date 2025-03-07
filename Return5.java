import java.util.Scanner;
class Return5                                                     // **Method Program**//
{
    public static void main(String[] args) 
    {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (isArmstrong(num))
        {
            System.out.println(num + " is an Armstrong number.");
        }
        else
        {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
    public static boolean isArmstrong(int num)
    {
        int original = num;
        int sum = 0;
        int digitCount = countDigits(num);  
        while (num != 0)
        {
            int digit = num % 10;  
            int power = 1;
            for (int i = 1; i <= digitCount; i++)
            {
                power *= digit;  
            }
            sum += power;
            num /= 10;  
        }
        return sum == original;
	}
    public static int countDigits(int num)
    {
        int count = 0;
        while (num != 0)
        {
            count++;
            num /= 10;  
        }
        return count;
    }
}
