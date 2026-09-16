import java.util.Scanner;

public class VoteAge {
    public static void main(String[] args) {
       System.out.println(Eligible() + "He/She is Eligible");
    }
    static boolean Eligible(){
        boolean elig = false;
        Scanner se = new Scanner(System.in);
        int age = se.nextInt();
        if (age >= 18) {
            elig = true;
        }
        return elig;
    }
}
