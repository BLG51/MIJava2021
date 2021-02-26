import java.util.Random;

public class ThirdProg {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] arr = new int[100];

        for (int i = 0; i < 100; i++) { //ввод радномных чисел
            arr[i] = rand.nextInt(200) - 100;
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxElem = -1, minElem = -1;

        for (int i = 0; i < 100; i++) { //находим минимальное и максимальные числа в массиве и их позицию
            if (arr[i] > max) {
                max = arr[i];
                maxElem = i;
            } else if (arr[i] < min) {
                min = arr[i];
                minElem = i;
            }
        }

        System.out.println("максимальный элемент: " + maxElem + ", значение: " + max + "\nминимальный элемент " +
            minElem + ", значение: " + min);

        for (int i = 0; i < 100; i++) { //вывод массива
            System.out.print(arr[i] + " ");
        }
    }
}

