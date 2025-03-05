class AllOperations1 {                                              //**METHOD PROGRAM**//
    public static void main(String[] args) {
        // Calling each method with the desired parameters
        add(10, 20);
        add(30, 40);
        prime(2);
        prime(3);
		prime(12);
        factorial(234);
		factorial(543);
        power(2, 5);
		power(3,6);
        reverse(12345);
		reverse(67890);
        productOfDigits(123);
		productOfDigits(234);
        palindrome(121);
		palindrome(567);
        sumOfDigits(123);
		sumOfDigits(678);
    }

    // Simple sum 
    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    // prime numbers find
    public static void prime(int num) {
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(num + " is prime? " + isPrime);
    }

    // factorial calculation
    public static void factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        System.out.println("Factorial of " + n + ": " + result);
    }

    // calculate power of number
    public static void power(int base, int exponent) {
        System.out.println(base + " raised to the power of " + exponent + ": " + Math.pow(base, exponent));
    }

    // reverse number
    public static void reverse(int n) {
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        System.out.println("Reversed number: " + reversed);
    }

    // product of digit
    public static void productOfDigits(int n) {
        int product = 1;
        while (n > 0) {
            int digit = n % 10;
            product *= digit;
            n /= 10;
        }
        System.out.println("Product of digits: " + product);
    }

    // pallindrome number
    public static void palindrome(int n) {
        int reversed = 0, original = n;
        while (n != 0) {  
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        System.out.println(original + " is palindrome? " + (original == reversed));
    }

    // sum of digits
    public static void sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}
