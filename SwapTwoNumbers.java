package day6assignment.BasicCorePrograms;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int x, y, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of X and Y:");
        x = sc.nextInt();
        y = sc.nextInt();

        System.out.println("before swapping numbers: "+x +"  "+ y);

        //swapping
        temp = x;
        x = y;
        y = temp;
        System.out.println("After swapping numbers: "+x +"   " + y);

    }
}
