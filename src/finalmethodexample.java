class ParentClass {
    void show() {
        System.out.println("This is Parent class");
    }
}

class ChildClass extends ParentClass {
    void show() {
        System.out.println("This is Child class");
    }
}

public class finalmethodexample {
    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.show();
    }
}
