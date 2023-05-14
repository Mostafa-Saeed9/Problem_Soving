package Task1;

public class BankApplication {
    public static void main(String[] args){

        Bank bank = new Bank(4);

        Account account1 = new Account("Mostafa Saeed", 1, 1000);
        bank.addAccount(account1);

        Account account2 = new Account("Osama Saeed", 2, 10000);
        bank.addAccount(account2);

        SavingAccount account3 = new SavingAccount("Mohamed Saeed", 3, 20000, 2.0);
        bank.addAccount(account3);

        bank.deposit(1, 500.00);
        System.out.println("Account 1 balance: " + bank.getBalance(1));
        bank.withdraw(2, 1000.00);
        System.out.println("Account 2 balance: " + bank.getBalance(2));

        bank.deposit(2, 100.00);
        System.out.println("Account 3 balance: " + bank.getBalance(2));
        System.out.println("Account 3 interest: " + account3.calculateInterest());
    }
    }

