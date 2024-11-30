class A {
    int i;
    private int j;

    void setij(int x, int y) {
        i = x;
        j = y;
    }

    int getj() {
        return j;
    }
}

class B extends A {
    int total;
//    int x = super.getj();

    void sum() {
        total = super.i + super.getj();
        System.out.println(total);
    }
}

public class access {
    public static void main(String[] args) {
        B obj = new B();
        obj.setij(10, 12);
        obj.sum();
        System.out.println("Total is: " + obj.total);
    }
}
