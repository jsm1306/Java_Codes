class FinalVariableExample {
    final int speed = 120;

    void dispaly() {
        System.out.println("Speed limit is: " + speed);
    }
}

public class final_variable {
    public static void main(String[] args) {
        FinalVariableExample obj = new FinalVariableExample();
        obj.dispaly();
    }
}
