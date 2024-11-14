class Sloth {
    final void move() {
        System.out.println("Sloth moves slowly");
    }
}

class Cheetah extends Sloth {
//    void move() { //shows error
//        System.out.println("Cheetah moves fastly");
//    }
}

public class finalmethod2 {
    public static void main(String[] args) {
        Sloth obj = new Sloth();
        obj.move();
        Cheetah obj2 = new Cheetah();
        obj2.move();
    }
}
