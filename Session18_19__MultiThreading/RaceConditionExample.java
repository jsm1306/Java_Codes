class BankAccount {
    private int balance = 1000;

    public synchronized void withdraw(int amount) {
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

class RaceConditionExample extends Thread {
    private BankAccount account;
    private int amount;

    public RaceConditionExample(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        RaceConditionExample t1 = new RaceConditionExample(account, 800);
        RaceConditionExample t2 = new RaceConditionExample(account, 880);
        t1.start();
        t2.start();
    }

    public void run() {
        account.withdraw(amount);
    }
}
