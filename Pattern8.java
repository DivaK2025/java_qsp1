 class Pattern8
	 {
   
    public static void main(String [] args)
    {
		int n = 6;
        int i, j;

        for (i = 0; i < n; i++)

			{
            for (j = 0; j < n-i; j++)
			{
                System.out.print("*");
            }

            System.out.println();
        }
    }
 }

   

