import java.util.*;

public class BinaryToDecimal {
    public static void main(String[] args) {
	
        String binary = " 10011";  
        int decimal = 0;
        
        
        int length = binary.length();
        for (int i = 0; i < length; i++) {
           
            if (binary.charAt(length - i - 1) == '1') {
                decimal += Math.pow(2, i);  
            }
        }

        System.out.println("Decimal number " + decimal);
    }
}
