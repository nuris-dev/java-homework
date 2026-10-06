import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            int n = scanner.nextInt();
            sum = sum + n;
        }

        System.out.println(sum);
    }
}