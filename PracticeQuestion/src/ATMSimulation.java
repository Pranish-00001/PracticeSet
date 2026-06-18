// Practice 10: ATM Simulation
// Encapsulation concept
//PRANISH KAHANL

class BankAccount {
    private double balance; //private so that secracy is maintained

    public BankAccount(double balance) {    //constructor
        // Do not allow an account to start with a negative balance.
        if (balance >= 0) {
            this.balance = balance;
        }
    }

    public double getBalance() {        //getter
        return balance;
    }

    public void deposit(double amount) { //deposit method
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited Rs. " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal denied.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn Rs. " + amount);
        }
    }
}

public class ATMSimulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000);

        System.out.println("Starting balance: Rs. " + account.getBalance());
        account.withdraw(1200);   // normal withdrawal
        account.withdraw(-100);   // invalid amount
        account.withdraw(10000);  // more than available balance
        account.deposit(800);
        System.out.println("Final balance: Rs. " + account.getBalance());
    }
}