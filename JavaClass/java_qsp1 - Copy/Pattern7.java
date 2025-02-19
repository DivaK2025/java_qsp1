class Pattern7 {
    public static void main(String[] args) {
        int n = 6;
        int i, j, k;

        
        for (i = n; i >= 1; i--) {
            
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            for (k = 1; k <= i; k++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
