class superlazy {
    void dosomething() {
        System.out.println("superlazy do something");
    }
}

class energeticperson extends superlazy {
    void dosomething() {
        System.out.println("energeticperson has lot of energy");
    }
}

public class finalclass2 {
    public static void main(String[] args) {
        superlazy obj = new superlazy();
        obj.dosomething();
        energeticperson obj2 = new energeticperson();
        obj2.dosomething();
    }
}
