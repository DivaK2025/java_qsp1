class RangeOfStrongNo                            //**method with return type**// 
{
	public static void main(String[] args) 
	{
		for(int start=1;start<=100000;start++)
		{
			if(isStrong(start))
			{
				System.out.println(start);
			}
		}
	}
	
	public static boolean isStrong(int num)
	{
		int sum =0;
		for(int i = num; i!=0;i/=10)
		{
			int last = i%10;
			sum = sum+Factorial(last);
		}
		return num == sum;
	}
	public static int Factorial(int digit)
	{
		int fact =1;
		for(int i=digit;i>0;i--)
		{
			fact*=i;
		}
		return fact;
	}

}




