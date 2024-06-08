package class5;

public class ForLoopTest {
    public static void main(String[] args) {
        //increment
        for (int a=0; a < 5; a +=1){
            System.out.println(a);
        }
        System.out.println("======================");
        //decrement
        //if the middle condition is true, it will print
        for (int b=5; b >= 0; b--){
            System.out.println(b);
        }
        System.out.println("======================");

        //using another convention
        int account = 0;
        for ( ; account < 5; ){
            //account++;  //it will add 1 first, then print
            System.out.println(account);
            account++;      //it will print first, then add 1
        }
        System.out.println("======================");

        //for each loop

        int[] numbers={50,30,25,84,99,123};
        for (int num:numbers){
                System.out.println(num);
        }
        System.out.println("======================");

        String[] names={"Rahim", "Karim", "Abdul", "Baten"};
        for (String fName:names){
            System.out.println(fName);
        }
        /*for (int p=0;p<numbers.length;p++){
            System.out.println(numbers[p]);

        }*/

        System.out.println("======================");

        //while loop
        int x=0;
        while (x<6) {
            System.out.println(x);
            x++;
        }
        System.out.println("======================");

        //do-while loop
        int y=10;
        do {
            System.out.println(y);
            y--;
        } while (y>=6);





    }
}
