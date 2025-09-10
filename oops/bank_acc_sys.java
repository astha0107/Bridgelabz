package oops;
public class bank_acc_sys{
    public static void main(String[] args) {
         BankAccount acc1 = new BankAccount(101, "Alia", 50000.0);
        BankAccount acc2 = new BankAccount(102, "Rohit", 30000.0);
        
        acc1.displayAccountDetails();
        System.out.println();
        acc2.displayAccountDetails();
        
        BankAccount.getTotalAccounts();
    }
}
class BankAccount {
    
    static String bankName = "HDFC Bank";
    private static int totalAccounts = 0;
    final int accountNumber;
    String accountHolderName;
    double balance;
    
    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        totalAccounts++;
    }
    
    
    public static void getTotalAccounts() {
        System.out.println("Total accounts: " + totalAccounts);
    }
    
    
    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Not a valid BankAccount.");
        }
    }
}