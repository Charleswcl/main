package iss;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        
        int currentYear = 2023;
        int userDateOfBirth = 1990;
        
        System.out.println("Age=" + (currentYear - userDateOfBirth));
    }
}
