public class InterfaceTransaction {
// Define the Transaction interface
public interface Transaction {
    double getAmount();
    boolean isValid();
}

// Implement DepositTransaction class
public class DepositTransaction implements Transaction {
    private double amount;
    private double depositLimit;

    public DepositTransaction(double amount, double depositLimit) {
        this.amount = amount;
        this.depositLimit = depositLimit;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public boolean isValid() {
        return amount > 0 && amount <= depositLimit;
    }
}

// Implement WithdrawalTransaction class
public class WithdrawalTransaction implements Transaction {
    private double amount;
    private double withdrawalLimit;

    public WithdrawalTransaction(double amount, double withdrawalLimit) {
        this.amount = amount;
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public boolean isValid() {
        return amount > 0 && amount <= withdrawalLimit;
    }
}

// TransactionProcessor class to process transactions
public class TransactionProcessor {
    public void processTransaction(Transaction transaction) {
        if (transaction.isValid()) {
            System.out.println("Transaction of $" + transaction.getAmount() + " is valid.");
        } else {
            System.out.println("Transaction of $" + transaction.getAmount() + " exceeds the limit or is invalid.");
        }
    }

    public static void main(String[] args) {
        // Creating transactions
       // Transaction deposit = new Deposittzzz  // Deposit with a limit of 1000
        Transaction withdrawal = new WithdrawalTransaction(300, 200);  // Withdrawal with a limit of 200

        // Processing transactions
        TransactionProcessor processor = new TransactionProcessor();
       // processor.processTransaction(deposit);
        processor.processTransaction(withdrawal);
    }
}

}