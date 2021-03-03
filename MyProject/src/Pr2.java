import java.util.Scanner;

public class Pr2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = max(sc.nextInt(), sc.nextInt());
        System.out.println(s);




//        int a = 4; int b = 121; int s = 0;
//        for (int i = a; i <= b; i++) {
//            s += i;
//        }
//        System.out.println(s);
    }

    //sum(int a, int b) {}



    static int max(int a, int b) {
        int n = 0;
        if (a >= b) {
            n = a;
        } else {
            n = b;
        }
        return n;
    }

    static int maxold(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }


}
