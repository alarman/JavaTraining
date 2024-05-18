package class4;

public class SwitchTest {
    public static void main(String[] args) {
        int mark=100;
        String browserName="firefox";

        switch (mark){
            case 80:
                System.out.println("A+");
                break;
            case 70:
                System.out.println("A");
                break;
            case 60:
                System.out.println("B");
                break;
            default:
                System.out.println("Fail");
        }
    }
}
