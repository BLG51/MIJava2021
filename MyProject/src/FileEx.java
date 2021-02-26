import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FileEx {
    public static void main(String[] args) throws IOException {

        //заполнение матрицы рандомными числами
        int[][] a = new int[10][10];
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                a[i][j]=rand.nextInt(1000);
            }

        }

        int[] arr = {1,2,3,4,5};

        //вывод массива
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("- массив");

        System.out.println(Arrays.toString(arr));

        System.out.println("\n"); //красная строка

        //составить матрицу из рандомных чисел. Cоздать два массива, в первый записать все четные числа, во второй все нечетные.
        //из массивов переписать числа в файл


//cчитывание
        File file = new File("file.txt");
        Scanner sc = new Scanner(file);
        int x = sc.nextInt();

//запись
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
        pw.print(x + " ");
        pw.flush();
        //pw.close();

    }
}
