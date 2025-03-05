import java.util.Scanner;            //**Method Binding**//
class CurrConverter {
    public static void main(String[] args) {
        System.out.println("Main start:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rupee value:");
        double rupee = sc.nextDouble();  
        rupeeToDollar(rupee);
        System.out.println("Main end");
    }

    public static void rupeeToDollar(double rupee) {
        System.out.println("Rupee to dollar start:");
        double dollar = rupee / 87.15; 
        System.out.println("Dollar: " + dollar);  
        dollarToEuro(dollar);
        System.out.println("Rupee to dollar end:");
    }

    public static void dollarToEuro(double dollar) {
        System.out.println("Dollar to Euro start:");
        double euro = dollar * 0.95;  
        System.out.println("Euro: " + euro);  
        euroToDirhams(euro);
        System.out.println("Dollar to Euro end:");
    }

    public static void euroToDirhams(double euro) {
        System.out.println("Euro to Dirhams start:");
        double dirhams = euro * 3.85;  
        System.out.println("Dirhams: " + dirhams);  
        System.out.println("Euro to Dirhams end:");
    }
}







//Main start:
//Enter the rupee value:
//100
//Rupee to dollar start:
//Dollar: 1.1474469305794606
//Dollar to Euro start:
//Euro: 1.0900745840504875
//Euro to Dirhams start:
//Dirhams: 4.196787148594377
//Euro to Dirhams end:
//Dollar to Euro end:
//Rupee to dollar end:
//Main end



