import java.util.ArrayList;
import java.util.List;

class Animal5 {
    String name;
    int age;

    Animal5(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}

class Dog5 extends Animal5 {
    String breed;

    Dog5(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    void makeSound() {
        System.out.println(name + " barks.");
    }

    void displayBreed() {
        System.out.println("Breed: " + breed);
    }
}

class PetManager {
    List<Animal5> pets;

    PetManager() {
        pets = new ArrayList<>();
    }

    void addPet(Animal5 pet) {
        pets.add(pet);
    }

    void displayAllPets() {
        for (Animal5 pet : pets) {
            pet.displayDetails();
            if (pet instanceof Dog5) {
                ((Dog5) pet).displayBreed();
            }
            pet.makeSound();
            System.out.println("-------------");
        }
    }
}

public class Petmanagementsystem {
    public static void main(String[] args) {
        PetManager petManager = new PetManager();

        Dog5 dog1 = new Dog5("Buddy", 3, "Golden Retriever");
        Dog5 dog2 = new Dog5("Bella", 2, "Labrador");
        petManager.addPet(dog1);
        petManager.addPet(dog2);
        petManager.displayAllPets();
    }
}
