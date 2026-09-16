    import java.util.Scanner;

    public class Palindrome{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Insert a string value: ");
        String str = in.nextLine();
        String reverse = "";
        for (int i = str.length()-1; i >= 0;  i-- )  {
            reverse += str.charAt(i);
        }
        if (str.equals(reverse)) {
    System.out.println("Palindrome");
        } else {
            System.out.println("Not A Palindrome");
}
    }
}



// OR we can use the StringBuilder method to reverse the string and find if the String is Palindrome or not!


// public class Palindrome {

//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         String str = in.nextLine();

//         String reverse = new StringBuilder(str).reverse().toString();

//         if (str.equals(reverse)) {
//             System.out.println("Palindrome");
//         } else {
//             System.out.println("Not A Palindrome");
//         }
//     }
// }
