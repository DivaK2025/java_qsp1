class TechNumber 
{
	public static void main(String[] args) 
	{
		int num = 2025, lent = 0 , div = 1;
		for(int i = num; i>0;i/=10)
			lent++;
		if(lent%2==0)
		{
			for(int i =1; i<=(lent/2);i++)
				div*=10;
			int sum =(num / div)+(num % div);
			int sqrt = sum*sum;

			System.out.println(sqrt==num?num+"  is a TechNumber.": num+"  is not a TechNumber.");
		}

	}
}
