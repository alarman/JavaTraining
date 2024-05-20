package class6;

public class MultilevelInheritanceP extends MultilevelInheritanceGrand {


    public void addition(int number1, int number2){
        number=number1+number2;
        System.out.println("Sum: " + number);
    }

    public void subtraction(int number1, int number2){
        number=number1-number2;
        System.out.println("Difference: " + number);
    }
}
