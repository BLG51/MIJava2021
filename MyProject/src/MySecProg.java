import java.util.Scanner;

public class MySecProg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = b-a+1;
        for (int x = a; x <= b; x++) {
            for (int i = 2; i < Math.sqrt(x); i++) {
                if (x % i == 0) {
                    k--;
                    break;
                }
            }

        }

        System.out.println("количество простых чисел " + k);

    }
}
