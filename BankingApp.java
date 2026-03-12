import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance = 1000.00;
        int choice = 0;

        while(choice!=4){
        System.out.println("");
        System.out.println("Please make selection:");
        System.out.println("1. Check Balance, 2. Deposit, 3. Withdraw, 4. Exit: ");
        choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Your balance is: " + balance);
                    break;

                case 2:
                    System.out.println("Enter deposit amount: ");
                    double deposit = input.nextDouble();
                    balance = balance + deposit;
                    System.out.println("Your balance is: " + balance);
                    break;

                case 3:
                    System.out.println("Enter withdrawal amount: ");
                    double withdrawal = input.nextDouble();
                    balance = balance - withdrawal;
                    if (balance < 0) {
                        balance = balance + withdrawal;
                        System.out.println("Insufficient funds!");
                        System.out.println("Your balance is: " + balance);
                    }
                    else
                        System.out.println("Your balance is: " + balance);
                    break;

                case 4:
                    System.out.println("Have a good day.");
                    break;

                default:
                    System.out.println("Enter valid selection.");
            }
        }
    }
}