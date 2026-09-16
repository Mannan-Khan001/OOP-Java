 // Input currency in rupees and output in USD.

import java.util.Scanner;

public class Currency {
    public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
System.out.println("Enter the amount: ");
float amount  = input.nextFloat();
if (amount > 0) {
    float currency = amount / 324;
    System.out.println(currency);
}
}
}
