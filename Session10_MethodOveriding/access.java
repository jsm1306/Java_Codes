class A{
    int i;
    private int j;
    void setij(int x, int y){
        i=x;
        j=y;
    }
}
class B extends A{
    int total;
    void sum(){
        // total = i+j;
    }
}
public class access {
    public static void main(String[] args) {
        B obj=new B();
        obj.setij(10,12);
        obj.sum();
        System.out.println("Total is: "+obj.total);
    }
 }
// class Animalx{
//     String name="Animal";
// }
// class Dogx extends Animalx{
//     String name ="Dog";
//     void printName(){
//         System.out.println(super.name);
//         System.out.println(name);
//     }
// }
// public class access {
//     public static void main(String[] args) {
//         Dogx obj=new Dogx();
//         obj.printName();
//     }
// }