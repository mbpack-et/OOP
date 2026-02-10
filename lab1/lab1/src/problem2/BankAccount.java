package problem2;

enum AccountType {
    SAVINGS,
    CREDIT,
    BUSINESS
}

public class BankAccount {

   
    public static int totalAccounts = 0;

    
    private final int accountId;

 
    private final AccountType type;

    private double balance;

    
    {
        totalAccounts++;
    }

  
    public BankAccount(int accountId, AccountType type) {
        this.accountId = accountId;   
        this.type = type;
        this.balance = 0;
    }

  
    public void deposit(double amount) {
        this.balance += amount;      
    }

    public void deposit(double amount, String currency) {
        System.out.println("Deposit currency: " + currency);
        this.balance += amount;
    }

   
    public int getAccountId() {
        return accountId;
    }

    public AccountType getType() {
        return type;
    }

    public double getBalance() {
        return balance;
    }

    
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(1, AccountType.SAVINGS);

        acc.deposit(100);
        acc.deposit(50, "USD");

        System.out.println("Account ID: " + acc.getAccountId());
        System.out.println("Type: " + acc.getType());
        System.out.println("Balance: " + acc.getBalance());
        System.out.println("Total accounts: " + totalAccounts);
    }
}
