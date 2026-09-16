import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int counter = 0;
        System.out.println("Value is = ");
        int num = in.nextInt();
        System.out.print("Which number do you want to count: ");
        int number = in.nextInt();
        while (num > 0) {
           int rem = num % 10;
            if (rem == number) {
                counter++;
            }
        num = num / 10;
    }
    System.out.println("The number " + number + " is repeated about: " + counter + " times.");
}
}
