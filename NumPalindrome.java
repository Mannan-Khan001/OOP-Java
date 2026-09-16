import java.util.Scanner;

public class NumPalindrome{
    public static void main(String[] args) {
        Palindrome();

    }
    static void Palindrome(){
        Scanner se = new Scanner(System.in);
        int n = se.nextInt();
        int original = n;
        int reverse = 0;
        while (n > 0) {
            int rem = n % 10;
            reverse = reverse * 10 + rem;
            n = n / 10;
        }
        if (original == reverse) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}