class ChIncreasePtr {
    public static void main(String[] args) {
        int n = 4; 
        
        
        for (int i = 1; i <= n; i++) {
            
           
            for (int j = 1; j <= i; j++) {
                
                System.out.print((char)('a' + j - 1) + " ");
            }
            
            System.out.println(); 
        }
    }
}
