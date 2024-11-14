public class finalparameter {
    public static void main(String[] args) {
        finalparameter obj = new finalparameter();
        obj.display(5);
    }

    void display(final int num) {
//        num += 10;
        System.out.println("The value of number is:" + num);
    }
}
