import java.util.*;

class KeithNumber {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter anumber:");
        int num = sc.nextInt();
        int dup = num;
        int len = 0;
        int sum = 0;
        boolean flag = true;

        // Loop to get the length of the number
        for (int i = num; i > 0; i /= 10) {
            len++;
        }

        // We use length as a size of an array
        int[] arr = new int[len];

        // Loop to store the initial digits from the number
        for (int i = len - 1; i >= 0; i--) {
            int rem = num % 10; // Fetch the last digit
            arr[i] = rem; // Store it inside the array using index
            num /= 10; // Update the number
        }

        // Infinite loop which will iterate
        while (true) {
            // Loop to find the sum of digits
            sum = 0; // Reset sum
            for (int i = 0; i < len; i++) {
                sum += arr[i];
            }

            // Update the array with the sum
            for (int i = 0; i < len - 1; i++) {
                arr[i] = arr[i + 1]; // Shift the array elements
            }
            arr[len - 1] = sum; // Update the last element with the sum

            // Check if the sum matches the original number
            if (dup == sum) {
                break;
            }

            // If sum exceeds the original number, it's not a Keith number
            if (sum > dup) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println(dup + " is a Keith number.");
        } else {
            System.out.println(dup + " is not a Keith number.");
        }
    }
}
