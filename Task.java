import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give the first number: ");
        int first = input.nextInt();
        System.out.println("Give the second number: ");
        int second = input.nextInt();

        if (first > 0 && second > 0 || first < 0 && second < 0) {
            System.out.println("Their Product is: " + first * second);
        } else {
            System.out.println("Their Sum is: " + (first + second));
        }
    }
}
