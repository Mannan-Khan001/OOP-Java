import java.util.Scanner;

public class ArmStrong{
    public static void main(String[] args) {
        Scanner se  = new Scanner(System.in);
        int x  = se.nextInt();
        int ans = Check(x);
        System.out.println(ans);
    }
    static int Check(int n){
        int original = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem*rem*rem;
            n = n/10;
        }
        if (sum == original) {
            System.out.println("Correct!");
        }
        return sum;
    }
}
