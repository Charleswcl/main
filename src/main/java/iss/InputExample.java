package iss;

import java.util.Scanner;

public class InputExample {

    public static void main(String[] args) {

        int currentYear = 2023;
        // System.out.println(getInputFromConsole(currentYear));
        System.out.println(getInputFromScanner(currentYear));
    }

    // public static String getInputFromConsole(int currentYear) {
    // String name = System.console().readLine("Hi, What's your name? ");
    // System.out.println("Hi " + name + ", nice to meet you.");

    // String dateOfBirth = System.console().readLine("What year were you born? ");
    // int age = currentYear - Integer.parseInt(dateOfBirth);

    // return "So you are " + age + " years old";
    // }

    public static String getInputFromScanner(int currentYear) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, what is your name? ");
        String name = scanner.nextLine().trim().toUpperCase();
        System.out.printf("Hi %s, nice to meet you.\n",  name);

        System.out.println("In which year were you born? ");
        boolean validDOB = false;
        int age = 0;

        do {
            System.out.println("Enter a year of birth between " + (currentYear -125) + " and " + (currentYear));
            age = checkData(currentYear, scanner.nextLine().trim());
            validDOB = age < 0 ? false : true;
        } while (!validDOB);
        

        return "You are " + age + " years old this year";
    }

    public static int checkData(int currentYear, String dateOfBirth) {

        int dob = Integer.parseInt(dateOfBirth);
        int minYear = currentYear - 125;

        if ((dob < minYear) || (dob > currentYear)) {
            return -1;
        }

        return (currentYear - dob);
    }
}
