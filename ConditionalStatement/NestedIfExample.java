package ConditionalStatement;

import java.util.Scanner;

public class NestedIfExample {
    public static void main(String[] args) {
        Scanner IN =new Scanner(System.in);
        System.out.print("Enter a number:-");
        int number =IN.nextInt();

        // Outer if statement
        if (number > 10) {
            System.out.println("The number is greater than 10.");

            // Nested if statement
            if (number < 30) {
                System.out.println("The number is less than 30.");
            } else {
                System.out.println("The number is 30 or greater.");
            }
        } else {
            System.out.println("The number is 10 or less.");
        }
    }
}
