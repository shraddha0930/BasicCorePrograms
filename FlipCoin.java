package day6assignment.BasicCorePrograms;


import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to flip coin:");
        int n = scanner.nextInt();
        int loopCount = 0;
        int heads = 0, tails = 0;

        double result = Math.random();

        while (loopCount < n) {
            if (result < 0.5) {
                System.out.println("That is heads.");
                heads++;
            } else {
                System.out.println("That is tails.");
                tails++;
            }
            loopCount++;
        }
        //(Math.randam() < 0.5) ? heads++ : tails++
        System.out.println("the percentage of heads is: " +(double)heads / n * 100);
        System.out.println("the percentage of tails is: " +(double)tails / n * 100);
    }
}