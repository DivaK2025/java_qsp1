import java.util.Scanner;
class  Tax
{
	public static void main(String[] args) 
	{
		System.out.println("year for income per annum ");
		double income=new Scanner(System.in).nextDouble();
		if(income>0 &&  income<= 400000 )
		{
			System.out.println("no tax ");
		
		}
		 else if(income>400001 &&  income<=800000 )
		{
			System.out.println("tou need to pay tax upto"+(income*0.05));
		
		}
		else if(income>800001 &&  income<=1200000 )
{
			System.out.println("tou need to pay tax upto"+(income*0.1));
		
		}
		else if(income>1200001 &&  income<=1600000 )
		{
			System.out.println("tou need to pay tax upto"+(income*0.15));
		
		}
		else if(income>1600001)
		{
			System.out.println("tou need to pay tax upto"+(income*0.3));
		
		}
		else
		{
			System.out.println("Invaild Output");
		}
	}
}