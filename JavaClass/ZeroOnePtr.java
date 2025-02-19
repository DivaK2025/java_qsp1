 class ZeroOnePtr {
    
    public static void main(String[]args)
    {
        int i, j;
		int n =4;
        
        for (i = 1; i <= n; i++) {
            
            for (j = 1; j <= i; j++) {
                
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                }
                
                else {
                    System.out.print(0 + " ");
                }
            }

            
            System.out.println();
        }
    }   
}
