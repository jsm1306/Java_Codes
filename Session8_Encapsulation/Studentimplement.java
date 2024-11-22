class Student {
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Enter a valid age.");
        }
    }
}
public class Studentimplement {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Alice");
        student.setAge(18);
        System.out.println("Name: " + student.getName()); // Output:Alice
        System.out.println("Age: " + student.getAge()); // Output:18
    }
}
