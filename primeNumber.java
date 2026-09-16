import java.util.Scanner;
public class primeNumber{
    public static void main(String[] args) {
        Scanner se = new Scanner (System.in);
System.out.println("Enter a number: ");
int num = se.nextInt();
int c = 2;
while (c < num) {
    if (num % c == 0 ) {
        System.out.println("Not a Prime number");
        
    }
    c += 1;
}
System.out.println("A prime Number" + num);
    }
}