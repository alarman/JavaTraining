package class2;

public class UnaryOperatorTest {
    public static void main(String[] args) {
        int mark=25;

        //mark++=mark+1;
        //mark--=mark-1;

        System.out.println(mark++); //first print mark, then increment mark by 1
        System.out.println(mark);
        System.out.println(--mark); //first decrement mark by 1, then print mark
        System.out.println(mark);
        System.out.println(mark--); //first print mark, then decrement mark by 1
        System.out.println(++mark); //first increment mark by 1, then print mark
        System.out.println(mark);

    }
}
