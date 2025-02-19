import java.util.Scanner;
class Solution {
    public static void main(String[] args) 
		{
		Scanner sc = new Scanner(System.in);

       Solution solution = new Solution();
	   System.out.println("Enter your Number:");
       int num = sc.nextInt(); 
       System.out.println("Reversed number: " + solution.reverse(num));
    }

    public int reverse(int x)
		{
        boolean flag = false;
        if (x < 0)
			{
            flag = true;  // If num is +ve
            x = Math.abs(x);  // to make no temporly positive
        }

		long rev = 0;
		for(int i = x ; i>0 ; i/=10)

			rev =rev*10+(i%10);

			if(flag)
				rev = rev*(-1);

			if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE)
				return 0;
			else
				return(int)rev;
		
	}
}
