package class7.abstraction;

public class Cat extends Animal {
    public String color;
    @Override
    public void animalSound() {
        System.out.println("Cat noise");
    }
    public void eat(){
        System.out.println("Cat eats fish");
    }
}
