class BankAccount {
    private int balance = 1000;

    public void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is going to withdraw $" + amount);
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: $" + balance);
        } else {
        }
        System.out.println(Thread.currentThread().getName() + " attempted to withdraw $" + amount + " but insufficient balance.");
    }

    public int getBalance() {
        return balance;
    }
}

class Withdrawalthread extends Thread {
    private BankAccount account;
    private int amount;

    public Withdrawalthread(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        account.withdraw(amount);
    }
}

class RaceConditionExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Withdrawalthread t1 = new Withdrawalthread(account, 800);
        Withdrawalthread t2 = new Withdrawalthread(account, 880);
        t1.start();
        t2.start();
    }
}