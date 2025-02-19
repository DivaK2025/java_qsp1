 class Pattern12 {
    public static void main(String[] args) {
		int n= 6;
        for (int i = 0; i  <  n; i++) {
            // Print spaces
            for (int j = 0; j  <  i; j++) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int j = i; j  <  n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}