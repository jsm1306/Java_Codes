class Animal7 {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog1 extends Animal7 {
    @Override
    void sound() {
        System.out.println("Dog barks bow");
    }
}

class Cat extends Animal7 {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class dogcat {
    public static void main(String[] args) {
        Animal7 animal;
        animal = new Dog1();
        animal.sound();
        animal = new Cat();
        animal.sound();
    }
}
