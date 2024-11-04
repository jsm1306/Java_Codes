class OuterClass1 {
    void method() {
        final String message = "Message from outerclass";
        class MethodLocalInnerClass {
            void display() {
                System.out.println(message);
            }
        }
        MethodLocalInnerClass inner = new MethodLocalInnerClass();
        inner.display();
    }
}

public class Method_inner_class {
    public static void main(String[] args) {
        OuterClass.StaticNestedClass nested = new OuterClass.StaticNestedClass();
        nested.display();
    }
}
