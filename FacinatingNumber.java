class FascinatingNumber {
    public static void main(String[] args) {
        int num = 327;
        String str = num + "" + (num * 2) + (num * 3); // Concatenate num, num*2, and num*3
        boolean flag = true;
        
        // Check that all digits from '1' to '9' appear exactly once in the concatenated string
        for (char i = '1'; i <= '9'; i++) {
            int cnt = 0; // Initialize the count for the current digit
            // Iterate through the concatenated string
            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j); // Get each character from the string
                if (ch == i) {
                    cnt++; // Increment count if the character matches
                }
            }
            if (cnt != 1) { // If any digit is missing or repeated
                flag = false;
                break; // Exit the loop if condition is not satisfied
            }
        }

        if (flag) {
            System.out.println(num + " is a Fascinating Number.");
        } else {
            System.out.println(num + " is not a Fascinating Number.");
        }
    }
}
