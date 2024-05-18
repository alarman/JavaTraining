package class4;

public class MethodTest {

    public static void printName(){
        System.out.println("Arman");
    }

    public void printNumber(){
        int number=50;
        System.out.println("Print Number " + number);
    }
    public float divide(){
        float number1=99, number2=12;
        float number3;
        number3=number1/number2;
        return number3;
    }

    public int add(int a, int b){
        int c=100, d;
        d=a+b+c;
        return d;
    }

}
