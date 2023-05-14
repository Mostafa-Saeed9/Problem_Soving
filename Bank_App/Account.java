package Task1;

public class Account {
        private String name;
        private int number;
        private double balance;

        public Account(String name, int number, double balance) {
            this.name = name;
            this.number = number;
            this.balance = balance;
        }

        public String getName() {
            return name;
        }

        public int getNumber() {
            return number;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double depositMoney) {
            balance += depositMoney;
        }
        public void withdraw(double withdrawMoney) {
            if (withdrawMoney > balance) {
                System.out.println("Your balance not enough");
            } else {
                balance -= withdrawMoney;
            }
        }
}
