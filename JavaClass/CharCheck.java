import java.util.Scanner;

class CharacterCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);

        String result = (Character.isUpperCase(inputChar)) ? "Uppercase"
                        : (Character.isLowerCase(inputChar)) ? "Lowercase"
                        : (Character.isDigit(inputChar)) ? "Digit"
                        : "Special Character";

        System.out.println("The character is: " + result);
    }
}
