class Narrowing
{
	public static void main(String[] args) 
	{	
		int i = 100;
		System.out.println(i);
		short s = i;
		System.out.println(s);

		char ch = 'i';
		System.out.println(ch);

		int i = ' i';
		System.out.println(i);

		long l ='i';
		System.out.println(l);
		
		float f ='i';
		System.out.println(f);

		double d = 'i';
		System.out.println(d);
	}
}
