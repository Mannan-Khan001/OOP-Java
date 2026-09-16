import java.util.Scanner;

public class Factorize {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = se.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println( n + " is divisible by " + i);
            } else {
                System.out.println(n + " is not divisible by " + i);
            }

        }
    }
}
