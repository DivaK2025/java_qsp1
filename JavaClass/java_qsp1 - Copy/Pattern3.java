class Pattern3
	{
    public static void main(String[] args)
		{
        int n = 4; 
        int i, j, k;

        
        for (i = 0; i <= n; i++) {
            
            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }
            
            for (k = 0; k < n-i; k++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
