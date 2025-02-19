class DogBarkingPattern {
    public static void main(String[] args) {
        // Initialize the starting value
        String pattern = "b";
        
        // Loop to create the pattern
        for (int i = 1; i <= 4; i++) {
            // Print '.' i times
            for (int j = 0; j < i; j++) {
                pattern += ".";
            }

            // Print 'b' i+1 times
            for (int k = 0; k < i + 1; k++) {
                pattern += "b";
            }
        }
        System.out.println(pattern);
    }
}
