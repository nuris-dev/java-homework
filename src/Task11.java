import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int product = 1;

        for (int i = 1; i <= n; i++) {
            int number = scanner.nextInt();
            product = product * number;
        }

        System.out.println(product);
    }
}
