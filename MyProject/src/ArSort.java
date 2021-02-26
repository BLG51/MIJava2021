import java.util.Arrays;
import java.util.Random;

public class ArSort {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        System.out.println("=======================================");

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));

    }
}
