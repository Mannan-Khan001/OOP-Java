import java.util.Scanner;

public class EvenOdd {
    public static void main(String[]args){
        boolean ans = Check();
        System.out.println(ans);
    }
static boolean  Check(){
    boolean check = false;
    Scanner se = new Scanner(System.in);
    int b = se.nextInt();
    if (b % 2 == 0) {
        check = true;
    }
return check;
}
}