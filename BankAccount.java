public class BankAccount {
    
        private String accountNumber;
        private String accountHolderName;
        private double balance;
    
        // Constructor
        public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
            this.balance = initialBalance;
        }
    
        // Method to deposit money into the account
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: $" + amount);
            } else {
                System.out.println("Invalid deposit amount.");
            }
        }
    
        // Method to withdraw money from the account
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew: $" + amount);
            } else if (amount > balance) {
                System.out.println("Insufficient funds.");
            } else {
                System.out.println("Invalid withdrawal amount.");
            }
        }
    
        // Method to check the account balance
        public double checkBalance() {
            return balance;
        }
    
        // Method to display account details
        public void displayAccountDetails() {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Balance: $" + balance);
        }
    
        public static void main(String[] args) {
            // Creating a new bank account
            BankAccount account = new BankAccount("123456789", "John Doe", 500.0);
    
            // Displaying account details
            account.displayAccountDetails();
    
            // Depositing money
            account.deposit(150.0);
            account.checkBalance();
    
            // Withdrawing money
            account.withdraw(100.0);
            account.checkBalance();
    
            // Checking balance
            System.out.println("Current Balance: $" + account.checkBalance());
        }
    }
    
    

