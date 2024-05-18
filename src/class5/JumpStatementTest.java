package class5;

public class JumpStatementTest {
    public static void main(String[] args) {
        //continue
        for (int i = 0; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("=====================");
        //break
        for (int j = 0; j <= 5; j++) {
            if (j == 3) {
                break;
            }
            System.out.println(j);
        }
    }
}
