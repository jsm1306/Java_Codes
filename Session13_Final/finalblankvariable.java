public class finalblankvariable {
    final int maxlimit;

    finalblankvariable(int limit) {
        maxlimit = limit;
    }

    public static void main(String args[]) {
        finalblankvariable obj = new finalblankvariable(10);
        obj.display();
    }

    void display() {
        
        System.out.println("The speed limit is:" + maxlimit);
    }
}
