import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = 5;
        plus(n); ///6
        System.out.println(n);



    }

    static int pow(int a, int b) {
        int s = 1;
        for (int i = 1; i <= b; i++) {
            s *=a;
        }
        return s;
    }

    static int plus(int n) {
      n = n+1;
      return n;
    }



    static void hello(){
        System.out.println("hello");
    }






}
