public class RotateNumber 
	{                                         //**method with return type**//

    public static void main(String[] args) 
		{
        int ip = 1234;
        int rot = rotate(ip);  
        while (rot != ip)
			{  
            System.out.println(rot);
            rot = rotate(rot);  
        }
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

    
    public static int rotate(int num) 
		{
        return (num % 10) * (int) Math.pow(10, count(num) - 1) + (num / 10);
    }

    public static int power(int digit, int ct) 
		{
        int pow = 1;
        for (int i = 1; i <= ct; i++) {  
            pow *= digit;
        }
        return pow;
    }
}