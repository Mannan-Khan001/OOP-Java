import java.util.Scanner;

public class InputProgram {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the integer: ");
        int n = se.nextInt();
        while (n != 0) {
            sum += n;

            n = se.nextInt();
        }
        System.out.println("The total summ is: " + sum);
    }
}
