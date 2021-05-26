package entities;

public class BankAccount {

    private final int accountNumber;
    private String ownerName;
    private double accountBalance;

    public BankAccount(int accountNumber, String ownerName){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.accountBalance = 0;
    }

    public BankAccount(int accountNumber, String ownerName, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        makeDeposit(initialDeposit);
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public double getAccountBalance(){
        return accountBalance;
    }

    public void makeDeposit(double amount){
        this.accountBalance += amount;
    }

    public void makeWithdraw(double amount){
        this.accountBalance -= (5 + amount);
    }

    @Override
    public String toString() {
        return "Account " + accountNumber +
                ", Holder: " + ownerName +
                ", Balance: $ " + String.format("%.2f", accountBalance);
    }
}
