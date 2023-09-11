/*11.Write an small application in Java to develop Banking Application in Which user deposits the amount Rs 1000.00 and then start withdrawingof Rs 400.00, Rs 300.00 and it throws exception "Not Sufficient Fund" when user withdraws Rs. 500 thereafter.*/
/*Author- Soumitra Das       Date-09/08/23*/


class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class Account {
    private double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Not Sufficient Funds");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class Bank {
    public static void main(String[] args) {
        Account ac = new Account(1000.00);

        try {
            ac.withdraw(400.00);
            ac.withdraw(300.00);
            //ac.deposit(500.50);
            ac.withdraw(500.00);  
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        ac.displayBalance();
    }
}
