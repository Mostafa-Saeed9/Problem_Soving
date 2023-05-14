package Task1;

public class SavingAccount extends  Account{

    private double interestRate;

    public SavingAccount(String name, int number, double balance, double interestRate) {
        super(name, number, balance);
        this.interestRate = interestRate;
    }


    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return getBalance() * (interestRate / 100);
    }

}
