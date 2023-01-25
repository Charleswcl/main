package iss;

public class ParsingExample {

    public static void main(String[] args) {

        int currentYear = 2023;
        String userDateOfBirth = "1990";

        int dateOfBirth = Integer.parseInt(userDateOfBirth);

        System.out.println("Age=" + (currentYear - dateOfBirth));

        String usersAgeWithPartialYear = "22.5";
        double ageWithPartialYear = Double.parseDouble(usersAgeWithPartialYear);
        System.out.println("The user says he is " + ageWithPartialYear);

    }

}
