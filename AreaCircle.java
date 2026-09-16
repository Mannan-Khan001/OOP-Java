import java.util.Scanner;
public class AreaCircle{
    public static void main(String []args){
        Scanner se = new Scanner(System.in);
        int radius = se.nextInt();
        final double pi = 3.14;

        double areaOfCircle = pi * (radius*radius);
        System.out.print("The area of circle is: " + areaOfCircle);
    }
}