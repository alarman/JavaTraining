package class2;

public class LogicalOperatorTest {
    public static void main(String[] args) {
        int num1=20, num2=40;
//returns true or false

        System.out.println(num1 != num2);
        System.out.println(num1 == num2);
        System.out.println(num1 > num2);
        System.out.println(num1 < num2);
        System.out.println(num1 >= num2); //match any condition
        System.out.println(num1 <= num2); // match any condition

        System.out.println("========================");

        System.out.println( (num1 != num2) && (num1 <= num2) );
        System.out.println( (num1 != num2) || (num1 >= num2) );
        System.out.println( (num1 == num2) && (num1 >= num2) );
    }
}
