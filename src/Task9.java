import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int d = scanner.nextInt();
        for (int i = 1; i <= d ; i++)
            sum = sum + i;
            System.out.println(sum);


    }
}