
import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        byte month = 12;
        byte percent = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal ($1K - $1M): ");
        int principal = scanner.nextInt();
        while (!((principal >= 1000)&&(principal <= 1_000_000))){
            System.out.print("Principal ($1K - $1M): ");
            principal = scanner.nextInt();
        }

        System.out.print("Annual Interest Rate: ");
        float interestRate = scanner.nextFloat() / percent / month;
        while (!((interestRate > 0)&&(interestRate <= 30))){
            System.out.print("Enter a value greater than 0 and less than or equal to 30. ");
            interestRate = scanner.nextFloat() / percent / month;
        }

        System.out.print("Period (Years): ");
        float periodYears = scanner.nextFloat() * month;
        while (!((periodYears >= 12)&&(periodYears <= 360))){
            System.out.print("Period (Years): ");
            periodYears = scanner.nextFloat() * month;
        }

        double mortgage = principal * (interestRate *(Math.pow((1 + interestRate), periodYears)) / (Math.pow((1 + interestRate), periodYears) - 1));
        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();

        System.out.println("Mortgage: " + defaultFormat.format(mortgage));
    }
}