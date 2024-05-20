package class7.interfaceTest;

public class Dog implements Animal {
    @Override
    public void animalSound() {
        System.out.println("Dog barks");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps");
    }
}
