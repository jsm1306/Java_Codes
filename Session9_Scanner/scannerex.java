import java.util.Scanner;

public class scannerex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Enter your cgpa: ");
        double cgpa = sc.nextDouble();
        System.out.println("Enter your department: ");
        String dept = sc.next();
        System.out.println("My name is: " + name + "\nAge: " + age + "\nCGPA: " + cgpa + "\nDepartment: " + dept);
        sc.close();
    }
}
