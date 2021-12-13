package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // double studentGPA = 3.45;
        // String studentName = "Mustafa";
        // String studentLastName = "Helal";

        // System.out.println(studentName + " " + studentLastName +
        // " has a GPA of " + studentGPA);
        // System.out.println("What do you want to update the GPA to?");

        // Scanner input = new Scanner(System.in);
        // studentGPA = input.nextDouble();

        // System.out.println(studentName + " " + studentLastName +
        // " has a GPA of " + studentGPA);

        // System.out.println("Pick a number between 1 and 10");
        // Scanner newScanner = new Scanner(System.in);

        // int inputtedNumber = newScanner.nextInt();

        // if (inputtedNumber < 5) {
        // System.out.println("Number is less than 5");
        // } else {
        // System.out.println("Number is higher than 5");
        // }

        System.out.println("What is your first name?");

        Scanner firstNameInput = new Scanner(System.in);

        String firstName = firstNameInput.next();

        System.out.println("Hello " + firstName + ", what is your last name?");

        Scanner lastNameInput = new Scanner(System.in);

        String lastName = lastNameInput.next();

        System.out.println("Welcome, " + firstName + " " + lastName
                + ", I would like to ask a couple of questions, is that okay? Answer with 'yes' or 'no'.");

        boolean waitingForAnswer = true;

        while (waitingForAnswer) {
            Scanner yesOrNo = new Scanner(System.in);
            String answerYesOrNo = yesOrNo.next();

            if (answerYesOrNo.equals("yes")) {
                System.out.println("Alright then, let's proceed.");
                waitingForAnswer = false;
            } else if (answerYesOrNo.equals("no")) {
                System.out.println("Understandable, have a nice day.");
                System.exit(1);
            } else {
                System.out.println("Was that a yes or a no?");
            }
        }

        System.out.println("test");
    }
}