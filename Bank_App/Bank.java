package Task1;

public class Bank {
    private Account[] accounts;
    private int accountsNumber;

    public Bank(int arraySize) {
        accounts = new Account[arraySize];
        accountsNumber = 0;
    }

    public void addAccount(Account account) {
        accounts[accountsNumber] = account;
        accountsNumber++;
    }

    public void deposit(int accountNumber, double money) {
        accounts[accountNumber].deposit(money);
    }

    public void withdraw(int accountNumber, double money) {
        accounts[accountNumber].withdraw(money);
    }

    public double getBalance(int accountNumber) {
        return accounts[accountNumber].getBalance();
    }
}
