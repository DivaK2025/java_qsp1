class Method4      //**Method Binding**// 
{
	public static void main(String[] args) 
	{
		System.out.println("Main start:");
		add('a',10);
		division(250.0,5.0);
		System.out.println("Main start:");

	}
	public static void add(int a,int b)
	{
		System.out.println("add start");
		int result = a+b;
		System.out.println("Result"+result);
		System.out.println("add end");
	}
	public static void division(double num,double den)
	{
		System.out.println("division start");
		double result = num/den;
		System.out.println("Result"+result);
		System.out.println("division end");
	}
}
