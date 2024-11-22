class Payment{
    void process(){
        System.out.println("Initializing payment process");
    }
}
class Paypal extends Payment{
    @Override
    void process(){
        System.out.println("Payment through Paypal");
    }
}
class Credit extends Payment{
    @Override
    void process(){
        System.out.println("Payment through Credit");
    }
}
public class paymentex {
    public static void main(String[] args) {
        Payment pay;
        pay=new Paypal();
        pay.process();
        pay=new Credit();
        pay.process();
    }
}
