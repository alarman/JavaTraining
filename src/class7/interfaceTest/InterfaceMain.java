package class7.interfaceTest;

public class InterfaceMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.animalSound();
        dog.sleep();

        Animal animal = new Dog();
        animal.animalSound();
        animal.sleep();
    }
}
