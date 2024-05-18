package class4;

public class MethodMainTest {
    public static void main(String[] args) {
        MethodTest.printName();
        MethodTest test = new MethodTest();
        System.out.println("Non void method " + test.divide());
        test.printNumber();
        System.out.println("Non void method with parameter " + test.add(20,10));

    }
}
