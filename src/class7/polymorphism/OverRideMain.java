package class7.polymorphism;

public class OverRideMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.animalSound();

        Cat cat = new Cat();
        cat.animalSound();

        Animal animal = new Animal();
        animal.animalSound();

        Animal animalCat = new Cat();
        animalCat.animalSound();
    }
}
