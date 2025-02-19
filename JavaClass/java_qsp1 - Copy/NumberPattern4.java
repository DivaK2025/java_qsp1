class NumberPattern4 {
    public static void main(String[] args) {
        int n = 5;  
        int[][] matrix = new int[n][n];  // Create a 2D array to hold pattern

        int num = 1;  

        //  Fill diagonals starting from the first column
        for (int col = 0; col < n; col++) {
            int row = 0;
            int c = col;
            // Fill diagonally downward for each column
            while (c < n) {
                matrix[row][c] = num++;
                row++;
                c++;
            }
        }

        //  diagonals fill starting from the second row
        for (int row = 1; row < n; row++) {
            int col = 0;
            int r = row;
            //  diagonally fill downward for each row
            while (r < n) {
                matrix[r][col] = num++;
                r++;
                col++;
            }
        }

        // Print the matrix in the desired format
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != 0) // Print non-zero values  
					{ 
                    System.out.print(matrix[i][j] + "     ");
                }
            }
            System.out.println();
        }
    }
}
