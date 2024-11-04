class OuterClass3 {
    private String message = "This is a message from Outerclass";

    class Innerclass {
        void display() {
            System.out.println(message);
        }
    }
}

public class Non_static_inner_class {
    public static void main(String[] args) {
        OuterClass3 outer = new OuterClass3();
        OuterClass3.Innerclass inner = outer.new Innerclass();
        inner.display();
    }
}
