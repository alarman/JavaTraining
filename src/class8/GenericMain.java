package class8;

public class GenericMain {
    public static void main(String[] args) {
        System.out.println("==========Non Generic=========");

        StringTest test=new StringTest("Hanif");
        System.out.println(test.getStr());

        IntegerTest integerTest=new IntegerTest(100);
        System.out.println(integerTest.getInteger());

        LongTest longTest=new LongTest(908l);
        System.out.println(longTest.getaLong());

        DoubleTest doubleTest=new DoubleTest(858.33);
        System.out.println(doubleTest.getaDouble());

        System.out.println("==========Generic without restriction=========");

        Generic<String> stringGeneric=new Generic<>("Sagor");
        System.out.println(stringGeneric.getObj());

        Generic<Integer> integerGeneric=new Generic<>(333);
        System.out.println(integerGeneric.getObj());

        Generic<Float> floatGeneric=new Generic<>(33.444f);
        System.out.println(floatGeneric.getObj());

        Generic<Long> longGeneric=new Generic<>(33233l);
        System.out.println(longGeneric.getObj());

        System.out.println("==========Generic with restriction=========");

        NumberTest<Integer> integerNumberTest=new NumberTest<>(33);
        System.out.println(integerNumberTest.getObj());

        NumberTest<Double> doubleNumberTest=new NumberTest<>(333.44);
        System.out.println(doubleNumberTest.getObj());

        NumberTest<Long> longNumberTest=new NumberTest<>(3333l);
        System.out.println(longNumberTest.getObj());



    }
}
