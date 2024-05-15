public class SavingsAccount {
    private double balance;
    private double interestRate;

    public SavingsAccount(double balance){
        this.balance = balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }
    public void calculateMonthlyInterest() {
        double monthlyInterestRate = interestRate / 12.0;
        double monthlyInterest = balance * monthlyInterestRate;
        balance += monthlyInterest;
    }
}
