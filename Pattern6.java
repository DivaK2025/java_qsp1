class Pattern7 {
    public static void main(String[] args) {
        int n = 6;
        int i, j, k;
        
        for (i = 1; i >= n; i--) 
			{  
            for (j = 0; j <= n-i-1; j++) 
				{  
                System.out.print(" ");
      			}
           for (k = 0; k <= i; k++) 
				{ 
               System.out.print("*");
           }
            System.out.println();
        }
    }
}