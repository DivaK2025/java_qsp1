class SwappingNo

{
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		System.out.println("a"+a);
		System.out.println("b"+b);

		a=a+b;
		b=a-b;
		a=b-a;
		
		System.out.println("a"+b);
		System.out.println("b"+a);

	}
}



//a=10
//b=20

//a=10+20=30
//a=20-10=10
//a=20-10=10