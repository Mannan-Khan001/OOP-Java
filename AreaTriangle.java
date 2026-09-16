
import java.util.Scanner;

public class AreaTriangle{
 public static void main(String[] args) {
    Scanner se = new Scanner(System.in);
    System.out.print("Enter the base of triangle: ");
    double base  = se.nextDouble();
    System.out.println("Enter the height of triangle: ");
    double height = se.nextDouble();

    double area = 0.5 * base * height;
    System.out.println(" The area of Triangle is: " + area);
 }   
}