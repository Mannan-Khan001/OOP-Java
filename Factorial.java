import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(Fact());
    }

    static int Fact() {
        int fact = 1;
        Scanner se = new Scanner(System.in);
        int n = se.nextInt();
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
