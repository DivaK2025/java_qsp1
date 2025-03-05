public class RotateNo            //**method with return type**//
	{

    public static void main(String[] args) 
		{
        System.out.println(rotate(1234));
        }

    public static int rotate(int num) 
		{
        return (num % 10) * (int) Math.pow(10, count(num) - 1) + (num / 10);
        }

    public static int count(int num) 
		{
        int ct = 0;
        while (num != 0) 
			{
            num /= 10;
            ct++;
        }
        return ct;
    }
	public static int power(int digit, int ct)
	{
		int pow=1;
		for(int i=0;i<=ct;i++)
		{
			pow*=digit;
		}
		return pow;
	}
}