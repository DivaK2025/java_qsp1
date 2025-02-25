import java.util.Scanner;

class Bank1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username1 = null;
        String password1 = null;
        String address1 = null;
        long contact = 0;
        double balance = 0.0;

        // Infinite loop for the main menu
        for (;;) {
            System.out.println();
            System.out.println("       WELCOME     ");
            System.out.println("LKSHMI CHIT FUND");
            System.out.println("1.EXISTING USER");
            System.out.println("2.CREATE YOUR ACCOUNT");
            System.out.println("ENTER AN OPTION:");
            int opt = sc.nextInt();
            System.out.println();

            if (opt == 1) {  // Option 1: Existing User
                if (username1 == null) {
                    System.out.println("CREATE YOUR ACCOUNT FIRST");
                    continue;  // If no user exists, prompt to create an account
                }

                System.out.println("LOGIN");
                System.out.println();

                // Login attempt loop
                for (int i = 3; i >= 1; i--) {
                    System.out.println();
                    System.out.println("Username:");
                    String username = sc.next();
                    System.out.println("Password:");
                    String password = sc.next();

                    if (username.equals(username1) && password.equals(password1)) {
                        System.out.println("LOGIN SUCCESSFUL");
                        // Home page options loop
                        while (true) {
                            System.out.println();
                            System.out.println("HOME PAGE");
                            System.out.println();
                            System.out.println("1.DEPOSIT");
                            System.out.println("2.WITHDRAW");
                            System.out.println("3.CHECK BALANCE");
                            System.out.println("4.MINI STATEMENT");
                            System.out.println("5.LOGOUT");
                            System.out.println();
                            System.out.println("Enter an option:");
                            int opt1 = sc.nextInt();
                            System.out.println();
                            switch (opt1) {
                                case 1: {
                                    System.out.println("DEPOSIT");
                                    System.out.println();
                                    System.out.println("Enter the amount:");
                                    double deposit = sc.nextDouble();
                                    balance += deposit;
                                    System.out.println("AMOUNT DEPOSITED SUCCESSFULLY");
                                    System.out.println();
                                    break;
                                }

                                case 2: {
                                    System.out.println("WITHDRAW");
                                    System.out.println();
                                    System.out.println("Enter the amount:");
                                    double withdraw = sc.nextDouble();
                                    System.out.println("Enter your pin:");
                                    String password3 = sc.next();
                                    if (password3.equals(password1)) {
                                        if (withdraw <= balance) {
                                            balance -= withdraw;
                                            System.out.println("AMOUNT DEBITED SUCCESSFULLY");
                                        } else {
                                            System.out.println("INSUFFICIENT FUNDS");
                                        }
                                    } else {
                                        System.out.println("WRONG PIN");
                                    }
                                    break;
                                }

                                case 3: {
                                    System.out.println("CHECK BALANCE");
                                    System.out.println();
                                    for (int j = 3; j >= 1; j--) {
                                        System.out.println("Enter your pin:");
                                        String password2 = sc.next();
                                        if (password2.equals(password1)) {
                                            System.out.println("ACCOUNT BALANCE: " + balance + " rs");
                                            break;
                                        } else {
                                            System.out.println("WRONG PIN");
                                            System.out.println("Attempts left: " + (j - 1));
                                        }
                                    }
                                    
                                        System.out.println("YOUR ACCOUNT HAS BEEN BLOCKED FOR 24 HOURS");
                                        System.exit(0); // Exit after 3 wrong attempts
                                    
                                    break;
                                }

                                case 4: {
                                    System.out.println("MINI STATEMENT");
                                    // Assuming you would implement mini statement functionality
                                    break;
                                }

                                case 5: {
                                    System.out.println("THANK YOU FOR USING OUR APP");
                                    System.out.println("VISIT AGAIN");
                                    System.exit(0); // Terminates the application
                                    break;
                                }

                                default: {
                                    System.out.println("INVALID OPTION. TRY AGAIN.");
                                    break;
                                }
                            }
                        }
                    } else {
                        System.out.println("INVALID CREDENTIALS");
                        System.out.println("Attempts left: " + (i - 1));
                    }
                }
                System.out.println("THANK YOU & NEVER VISIT AGAIN");
                System.exit(0); // Exit after failed login attempts
            } else if (opt == 2) {  // Option 2: Create Account
                System.out.println("ACCOUNT CREATION");
                System.out.println("Username:");
                username1 = sc.next();
                System.out.println("Password:");
                password1 = sc.next();
                System.out.println("Address:");
                sc.nextLine();  // To consume the remaining newline character
                address1 = sc.nextLine();
                System.out.println("Contact:");
                contact = sc.nextLong();
                System.out.println("Deposit Amount:");
                balance = sc.nextDouble();
                System.out.println();
                System.out.println("ACCOUNT CREATED SUCCESSFULLY");
            } else {
                System.out.println("INVALID OPTION");
            }
        }
    }
}
