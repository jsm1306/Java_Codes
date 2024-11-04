class OuterClass {
    static String message = "Message from outerclass";

    static class StaticNestedClass {
        void display() {
            System.out.println(message);
        }
    }
}

public class Static_Inner_Class {
    public static void main(String[] args) {
        OuterClass.StaticNestedClass nested = new OuterClass.StaticNestedClass();
        nested.display();
    }
}
