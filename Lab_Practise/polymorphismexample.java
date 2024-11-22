class Animal3 {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog3 extends Animal3 {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat3 extends Animal3 {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class polymorphismexample {
    public static void main(String[] args) {
        Animal3 myAnimal = new Dog3();
        myAnimal.makeSound();
        myAnimal = new Cat3();
        myAnimal.makeSound();
    }
}


