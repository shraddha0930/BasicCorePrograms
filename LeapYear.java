package day6assignment.BasicCorePrograms;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year = scanner.nextInt();
// boolean isleapyear = false;
        //isleapyear = ((year % 4 == 0) && (year % 100 != 0))|| (year % 400 == 0) ? true : false
        if (((year % 4 == 0) && (year % 100 != 0))|| (year % 400 == 0)){
            System.out.println("Leap year");
        }
        else
            System.out.println("Not a Leap Year");
    }
}
