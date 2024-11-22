class Department{
    String name;
    Department(String name) {
        this.name=name;
    } 
}
class University{
    String uniName;
    Department dept;
    University(String uniName, Department dept){
        this.uniName=uniName;
        this.dept=dept;
    }
}
public class aggregation {
    public static void main(String[] args) {
        Department dept = new Department("Computer Science");
        University uni = new University("KL university",dept);
        System.out.println(uni.dept);
        System.out.println(uni.uniName);
}}
