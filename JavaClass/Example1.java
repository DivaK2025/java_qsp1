
import java.util.Scanner;
class Example1 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number:");
		int num =new Scanner(System.in).nextInt();
		int dup = num;
		int cnt = 0;
		/*loopto get the count of digit
		every ither we remove a digit and we do the task until num is not zero and uin every ither cnt is increase by 
		1*/
		while(num>0) // loop is either num is not zero
		{
			cnt++;//increse the cnt by one in every ither
			num/=10;//every we update the num and last num become zero
		}
		String newNum ="";// new num is int i empty(no char)
		if(cnt%2==0)//if the num length is even
		{
			for(int i=dup;i>0;i/=10)
			{
				int rem = i%10;
				if(rem%2!=0)
				{
					newNum = ++rem + newNum;
				}
				else
				{
					newNum =rem+ newNum;
				}
			}
		}
		else //when the length is odd
		{
			for(int i = dup; i>0;i/=10)
			{
				int rem = i%10;
				if(rem%2==0){
					newNum = +rem+ newNum;
				}
				else{
					newNum = rem+newNum;
				}
			}
		}
		System.out.println(dup+":"+newNum);
	}
}
