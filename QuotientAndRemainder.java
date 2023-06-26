package day6assignment.BasicCorePrograms;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        System.out.println("enter the Dividend number:");
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();

        System.out.println("enter the Divisor number:");
        Scanner sc1 = new Scanner(System.in);
        int divisor = sc.nextInt();

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);


    }
}
