
import java.util.Scanner;

// To calculate Fibonacci Series up to n numbers.

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    int a = 0;
    int b = 1;
    System.out.println("Enter a number: ");
    int num = input.nextInt();
    for (int i = 0; i <= num; i++) {
        System.out.println(a + " ");
    int c = a + b;
    a = b;
    b = c;
    }

    }
}
