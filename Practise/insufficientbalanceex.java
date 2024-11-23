class InsufficientFunds extends Exception {
    public InsufficientFunds(String s) {
        super(s);
    }
}

public class insufficientbalanceex {
    private int balance;

    public insufficientbalanceex(int balance) {
        this.balance = balance;
    }

    public static void main(String args[]) {
        insufficientbalanceex ob = new insufficientbalanceex(1200);
        try {
            ob.check(140);
        } catch (InsufficientFunds e) {
            System.out.println(e);
        }
    }

    public void check(int amount) throws InsufficientFunds {
        if (balance > amount) {
            System.out.println("Successfully withdrawed " + amount);
            balance -= amount;
            System.out.println("The balance is:" + balance);
        } else {
            System.out.println("Insufficient Funds");
        }
    }
}
