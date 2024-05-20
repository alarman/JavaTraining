package class7.polymorphism;

public class MathTest {
    int number;

    public void addition(){
        int number1 = 22, number2=33;
        number = number1+number2;
        System.out.println("Addition: "+ number);
    }

    public void addition(int number1){
        int number2 = 33;
        number = number1+number2;
        System.out.println("Addition: "+ number);
    }
    public void addition(int number1, int number2){
        number = number1+number2;
        System.out.println("Addition: "+ number);
    }

    public static void main(String[] args) {
        MathTest test = new MathTest();
        test.addition();
        test.addition(44);
        test.addition(66,77);
    }
}
