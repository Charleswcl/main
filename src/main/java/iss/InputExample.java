package iss;

public class InputExample {

    public static void main(String[] args) {

        int currentYear = 2023;
        System.out.println(getInputFromConsole(currentYear));
        System.out.println(getInputFromScanner(currentYear));
    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, What's your name? ");
        System.out.println("Hi " + name + ", nice to meet you.");
        return "";
    }

    public static String getInputFromScanner(int currentYear) {

        return "";
    }
}
