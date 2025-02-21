import java.util.Random;

class OTPGeneration {
    public static void main(String[] args) {
        
        int lent = 6
       
        String otp = generateOTP(lent);
       
        System.out.println("Your OTP is: " + otp);
    }
    
 
    public static String generateOTP(int length) {
        Random rand = new Random();
        StringBuilder otp = new StringBuilder();
        
      
        for (int i = 0; i < length; i++) {
            otp.append(rand.nextInt(10)); 
        }
        
        return otp.toString();
    }
}
