
import java.util.Scanner;

public class PyTriplets {

    public static void main(String[] args) {
        Check();
    }

    static void Check() {
        Scanner se = new Scanner(System.in);
        int a = se.nextInt();
        int b = se.nextInt();
        int c = se.nextInt();
        int sum = a * a + b * b;
        if (sum == c * c) {
            System.out.println("Pythegorean Trples");
        } else {
            System.out.println("Not triples!");
        }
    }
}
