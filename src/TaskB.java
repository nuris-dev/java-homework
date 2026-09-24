import java.util.Scanner;

public class TaskB {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        System.out.println("The next number for the number " + n + " is "+(n+1)+".");
        System.out.println("The previous number for the number " + n +" is "+(n-1)+".");

    }
}