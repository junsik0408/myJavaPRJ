import java.util.Scanner;

public class Code_0079 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 1000.0;

        System.out.println("Welcome to the ATM!");
        System.out.println("1: Check Balance");
        System.out.println("2: Deposit Money");
        System.out.println("3: Withdraw Money");
        System.out.println("4: Exit");

        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Your balance is $" + balance);
        } else if (choice == 2) {
            System.out.print("Enter deposit amount: ");
            double deposit = scanner.nextDouble();
            balance += deposit;
            System.out.println("New balance is $" + balance);
        } else if (choice == 3) {
            System.out.print("Enter withdrawal amount: ");
            double withdraw = scanner.nextDouble();
            if (withdraw <= balance) {
                balance -= withdraw;
                System.out.println("New balance is $" + balance);
            } else {
                System.out.println("Insufficient funds.");
            }
        } else if (choice == 4) {
            System.out.println("Thank you for using the ATM!");
        } else {
            System.out.println("Invalid choice. Please try again.");
        }

        scanner.close();
    }
}
