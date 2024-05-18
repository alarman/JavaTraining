package class3;

public class PersonTest {
    public static void main(String[] args) {
        Person hasibul=new Person();
        hasibul.name="Hasibul";
        hasibul.gender="Male";
        hasibul.height=5.7f;

        hasibul.speak();
        hasibul.work();

        Person kobir=new Person();
        kobir.name="Kobir";
        kobir.gender="Male";
        kobir.height=5.2f;

        Person mili=new Person();
        mili.name="Mili";
        mili.gender="Female";
        mili.height=4.2f;
    }
}
