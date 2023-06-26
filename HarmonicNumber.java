package day6assignment.BasicCorePrograms;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        System.out.println("Enter harmonic number to print:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double result = 0;
        if (n == 0) {
            System.out.println("Please enter valid no.");
        } else {
            System.out.println("Harmonic series:");
            for (int i = 1; i <= n; i++) {
                result = result + (double) 1 / i;
                System.out.println("1/" +i+ ":" + result + ",");
            }
        }
    }
}

