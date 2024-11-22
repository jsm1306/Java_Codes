public class whileloop {
    public static void main(String[] args) {
        int balance=1000;
        while(true){
            if(balance<9)
                break;
            balance=balance-9;
        }
        System.out.println(balance);
    }
}
