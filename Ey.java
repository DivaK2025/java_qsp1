import java.util.Scanner;
class Ey
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number:");
        String player = sc.next();
		
		int onecnt = 0;
		int zerocnt = 0;

		for(int i = 0;i < = player;i++)
		if(player.charAt(i)==1)
		{
			onecnt++;
			zerocnt=0;
		}
        if(onecnt>=7)
		{
			System.out.println("print Yes" +onecnt);
		}
		if(player.charAt(i)==0)
		{
			onecnt++;
			zerocnt=0;
		}
		if(zerocnt>=7)
		{
			System.out.println("print No"+zerocnt);
		}


	
	}
}
