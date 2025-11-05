//задача: умовний оператор - 1
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        int y;
        if (x<5) {
            y = x*x - 3*x+4;
        } else {
            y = x+7;
        }
        System.out.print(y);
    }
}

//задача: прямокутник
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        while (console.hasNextInt()) {
            int n = console.nextInt();
            int m = console.nextInt();

            int perimeter = 2 * (n + m);
            int area = n * m;
            System.out.println(perimeter + " " + area);
        }
        console.close();
    }

//задача: вивести масив 2
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
            int n = console.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = console.nextInt();
            }
            System.out.print(arr[n - 1]);
            for (int i = n - 2; i >= 0; i--) {
                System.out.print(" " + arr[i]);
            }
            console.close();
        }
    }

