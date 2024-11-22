import java.util.ArrayList;
import java.util.Collections;

public class StudentsList {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Sindhu");
        students.add("Mythri");
        students.add("Lucky");
        students.add("Pavan");
        for (String student : students) {
            System.out.println(student);
        }
        Collections.sort(students);
        for (String student : students) {
            System.out.println(student);
        }
        students.set(2, "Deepti");
        for (String student : students) {
            System.out.println(student);
        }

    }
}
