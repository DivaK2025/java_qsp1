import java.util.Scanner;
  class Pattern14
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int n = 5;
  
        for (int i = 1; i <= n; i++)
        {
            
			
			//Printing spaces at the beginning of each row 
			for(int j = 2*n-i; j > i; j--)
            {
                System.out.print(" ");
            }
  
            //Printing i stars at the end of each row
  
            for (int j = i; j >= 1; j--)
            {
                System.out.print("* ");
            }
             
            System.out.println();
        }
  
        //Printing lower half of the pattern 
  
        for (int i = n-1; i >= 1; i--)
        {
            //Printing spaces at the beginning of each row
  
            for (int j = 2*n-i; j > i; j--)
            {
                System.out.print(" ");
            }
  
            //Printing i stars at the end of each row
  
            for (int j = i; j >= 1; j--)
            {
                System.out.print("* ");
            }
             
            System.out.println();
        }
    }
}