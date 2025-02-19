class ReverseNumber 
{
	public static void main(String[] args) 
	{
		int  num =1234;
		int dup = num;
		int rev = 0;

		int rem =num%10;
		rev =rev*10+rem;

		num = num/10;
		rem = num%10;
		rev = rev*10+rem;

		num = num/10;
		rem = num%10;
		rev =rev*10+rem;

		num = num/10;
		rem = num%10;
		rev =rev*10+rem;



		System.out.println(dup+":"+rev);
	}
}
