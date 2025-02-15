class Pattern4 {
    public static void main(String[] args) {
        int n = 5;
        int i, j, k;
        
        for (i = 0; i < n; i++) 
			{ 
            for (j = 0; j < n-i-1; j++) 
				{ 
                System.out.print(" ");
            }
            for (k = 0; k < n; k++) 
				{ 
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
