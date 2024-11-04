import java.util.Scanner;
public class poundstokg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight in pounds");
        double pound = sc.nextDouble();
        double kilograms = pound * 0.454;
        System.out.println(pound + " pounds in kilograms is: "+kilograms);
    }
}
