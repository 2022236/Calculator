package calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author lizam
 */
public class Calculator {
    public static void main(String[] args) throws IOException {
       System.out.println("This is The Mathlete's Best Friend.");
        
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String userInput;
        boolean again = false;

        do {
            System.out.println("What kind of operation would you like to do?");
            try {
                System.out.println("1- Addition, 2- Subtraction, 3- Multiplication, 4- Division");
                userInput = sc.readLine();

                int choice = Integer.parseInt(userInput);

                System.out.println("Enter the first number:");
                String firstNum = sc.readLine();
                System.out.println("Enter the second number:");
                String secondNum = sc.readLine();

                int num1 = Integer.parseInt(firstNum);
                int num2 = Integer.parseInt(secondNum);
                if (choice == 1) {
                    int total = num1 + num2;
                    String result = String.valueOf(total);
                    System.out.println("The result is: " + result);
                } else if (choice == 2) {
                    int total = num1 - num2;
                    String result = String.valueOf(total);
                    System.out.println("The result is: " + result);
                } else if (choice == 3) {
                    int total = num1 * num2;
                    String result = String.valueOf(total);
                    System.out.println("The result is: " + result);
                } else if (choice == 4) {
                    int total = num1 / num2;
                    String result = String.valueOf(total);
                    System.out.println("The result is: " + result);
                } else {
                    System.out.println("Something went wrong.");
                }
                System.out.println("Do you want to perform another operation? (yes/no)");
                userInput = sc.readLine();
                again = userInput.equalsIgnoreCase("yes");
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid input.");
            }
        } while (again);
        System.out.println("Thank you!");
        sc.close();
    }  
}