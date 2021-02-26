import java.util.Scanner;

public class MyProgramm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i < Math.sqrt(x); i++) {
            if (x % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("число простое");
        } else {
            System.out.println("число сложное");
        }
    }
}
