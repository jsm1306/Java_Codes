class FinalClass {
    void display() {
        System.out.println("Method in a finalclass");
    }
}

class childclass extends FinalClass {
//
}

public class finalclassexample {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.display();
    }
}
