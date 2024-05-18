package class2;

public class AssignOperatorTest {
    public static void main(String[] args) {

        int number1=20, number2=40;

        number1 += number2; //number1 = number1+number2
        System.out.println(number1);

        number2 -= number1; //number2 = number2-number1
        System.out.println(number2);

        number1 *= number2; //number1 = number1*number2
        System.out.println(number1);

        number2 /= 5;
        System.out.println(number2);

        number1 %= 8;
        System.out.println(number1);
    }
}
