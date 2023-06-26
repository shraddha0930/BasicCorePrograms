package day6assignment.BasicCorePrograms;

import java.util.Scanner;

public class PowersOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = scanner.nextInt();
        int i = 0;
        int powerOfTwo = 1;

        while (i <= n) {
            System.out.println(i + " " + powerOfTwo);
            //Math.pow(2,i);
            powerOfTwo = 2 * powerOfTwo;
            i++;
        }

    }
}
