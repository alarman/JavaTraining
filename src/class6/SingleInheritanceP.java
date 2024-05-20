package class6;

public class SingleInheritanceP extends SingleInheritanceMain {
    int number;

    public void addition(int number1, int number2){
        number=number1+number2;
        System.out.println("Sum: " + number);
    }

    public void subtraction(int number1, int number2){
        number=number1-number2;
        System.out.println("Difference: " + number);
    }
}
