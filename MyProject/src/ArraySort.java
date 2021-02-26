import java.util.Arrays;
import java.util.Random;

public class ArraySort {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        System.out.println("=======================================");

        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int a = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = a;
                }
            }
            System.out.println(Arrays.toString(array));

        }

        System.out.println("=======================================");

        System.out.println(Arrays.toString(array));

        int n = random.nextInt(10);
        System.out.println("-> " + n);

        int a = 0, b = array.length - 1;

        while (b - a != 1) {
            int mid = (a + b) / 2;
            if (n <= array[mid]) {
                b = mid;
            } else {
                a = mid;
            }

            System.out.println(array[a] + " " + array[b]);
        }
        if (n == array[a] || n == array[b]) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }
    }
}
