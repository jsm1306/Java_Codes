import java.util.Scanner;
public class scannerobject {
    public static void main(String[] args) {
        String input = "Hello;World;Java;Programming";
        Scanner sc1 = new Scanner(input);
        // Scanner sc2 = new Scanner(File file);
        // Scanner sc3 = new Scanner(String str);
        // String input = "Hello;World;Java;Programming";
        // Scanner scanner = new Scanner(input);
        sc1.useDelimiter(";");
        while (sc1.hasNext()) {
            String token = sc1.next();
            System.out.println(token);
        }
        sc1.close();

    }
}
