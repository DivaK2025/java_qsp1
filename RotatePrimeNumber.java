public class RotatePrimeNumber {               //**method with return type**//

    public static void main(String[] args) {
        int ip = 13;  
        int original = ip;  
        int rot = rotate(ip);  

        
        do {
            if (isPrime(rot)) 
				{   
                System.out.println(rot);  
            }
            rot = rotate(rot);  
        } while (rot != original);  
    }

    public static int count(int num) {
        int ct = 0;
        while (num != 0) {
            num /= 10;
            ct++;
        }
        return ct;
    }

   
    public static int rotate(int num) {
        return (num % 10) * (int) Math.pow(10, count(num) - 1) + (num / 10);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;  
            }
        }
        return true;
    }

    public static int power(int digit, int ct) {
        int pow = 1;
        for (int i = 1; i <= ct; i++) {  
            pow *= digit;
        }
        return pow;
    }
}
