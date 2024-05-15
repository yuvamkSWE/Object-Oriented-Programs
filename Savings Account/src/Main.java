import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter starting balance: ");
        double startingBalance = scanner.nextDouble();

        System.out.print("Enter annual interest rate (in percentage): ");
        double annualInterestRate = scanner.nextDouble() / 100;

        System.out.print("Enter number of months: ");
        int numberOfMonths = scanner.nextInt();

        SavingsAccount account = new SavingsAccount(startingBalance);
        account.setInterestRate(annualInterestRate);

        double totalDeposits = 0.0;
        double totalWithdrawals = 0.0;
        double totalInterest = 0.0;

        for (int i = 1; i <= numberOfMonths; i++) {
            System.out.println("\nMonth " + i);
            System.out.print("Enter amount deposited: ");
            double deposit = scanner.nextDouble();
            account.deposit(deposit);
            totalDeposits += deposit;

            System.out.print("Enter amount withdrawn: ");
            double withdrawal = scanner.nextDouble();
            account.withdraw(withdrawal);
            totalWithdrawals += withdrawal;

            account.calculateMonthlyInterest();
            totalInterest += (account.getBalance() - (startingBalance + totalDeposits - totalWithdrawals));

            System.out.println("Ending balance: " + account.getBalance());
        }

        System.out.println("\nEnd of " + numberOfMonths + " months");
        System.out.println("Ending balance: " + account.getBalance());
        System.out.println("Total deposits: " + totalDeposits);
        System.out.println("Total withdrawals: " + totalWithdrawals);
        System.out.println("Total interest earned: " + totalInterest);
    }
}