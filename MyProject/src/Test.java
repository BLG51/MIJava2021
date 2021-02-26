import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(50);
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

