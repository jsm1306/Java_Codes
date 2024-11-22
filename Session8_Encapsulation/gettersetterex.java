class Human{
    private int age;
    private long phone;
    private String name;
    public int getAge() {
        return age;
    }
    public long getPhone() {
        return phone;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        if (age>0){
        this.age = age;
    }}
    public void setPhone(long phone) {
        this.phone = phone;
    }
    public void setName(String name) {
        this.name = name;
    }

}
public class gettersetterex {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(18);
        obj.setPhone(9030107060L);
        obj.setName("Sindhu");
        System.out.print(obj.getName()+": "+ obj.getAge()+"\nPhone: "+obj.getPhone());
    }
}
