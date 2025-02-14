 class Pattern2
	 {
   
    public static void main(String [] args)
    {
		int n = 6;
        int i, j;

        for (i = 1; i <n; i++)

			{
            for (j = 1; j <= n-i; j++)
			{
                System.out.print("*");
            }

            System.out.println();
        }
    }
 }

   

