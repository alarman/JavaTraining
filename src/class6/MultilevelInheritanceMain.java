package class6;

public class MultilevelInheritanceMain {
    public static void main(String[] args) {
        MultilevelInheritanceChild child=new MultilevelInheritanceChild();

        child.number=500;

        child.addition(100,320);
        child.subtraction(300,250);
        child.multiply(15,25);
        child.divide(50,10);

    }
}
