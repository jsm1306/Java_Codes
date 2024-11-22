// class Vehiclex{
//     String name;
//     Vehiclex(String name){
//         this.name=name;
//     }
// }
// class Cars extends Vehiclex{
//     Cars(String name){
//         super(name);
//         System.out.print("Car constructor is called");
//     }
//     void display(){
//         System.out.println("The car's name is: "+name);
//     }
// }
// public class superconstruct {
//     public static void main(String[] args) {
//         Cars car=new Cars("BMW");
//         car.display();
//     }
// }

class Vehiclex {
    void start() {
        System.out.println("The vehicle is started");
    }
}

class Cars10 extends Vehiclex {
    @Override
    void start() {
        System.out.println("The car is started ");
    }
}

public class superconstruct {
    public static void main(String[] args) {
        Vehiclex car = new Cars10();

        car.start();
    }
}