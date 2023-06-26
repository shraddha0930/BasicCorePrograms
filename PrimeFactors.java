package day6assignment.BasicCorePrograms;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        System.out.println("enter the number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print("Prime factors are:");
        int c = 2;
        while (n > 1) {
            if (n % c == 0) {
                System.out.print(c + " ");
                n /= c;
            } else
                c++;
        }
    }
}
