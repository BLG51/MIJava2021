import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Prog {
    public static void main(String[] args) throws IOException {
        Random rand = new Random();

        int[][] mat = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                mat[i][j] = rand.nextInt(1000);
            }
        }


        int[] even = new int[100]; //chet
        int[] odd = new int[100]; //nechet
        int k = 0;
        int l = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (mat[i][j] % 2 == 0) {
                    even[k++] = mat[i][j];
                } else {
                    odd[l++] = mat[i][j];
                }
            }
        }

        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));

        for (int i = 0; i < k; i++) {
            pw.print(even[i] + " ");
        }
        pw.print("- массив четных чисел\n");


        for (int i = 0; i < l; i++) {
            pw.print(odd[i] + " ");
        }
        pw.print("- массив нечетных чисел\n");
        pw.flush();
    }
}
