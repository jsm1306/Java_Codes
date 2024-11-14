class ParentClass {
    final void show() {
        System.out.println("This is Parent class");
    }
}

class ChildClass3 extends ParentClass {
//    void show() {
//        System.out.println("This is Child class");
//    }
}

public class finalmethodexample {
    public static void main(String[] args) {
        ChildClass3 obj = new ChildClass3();
        obj.show();
    }
}
