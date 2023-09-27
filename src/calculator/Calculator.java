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
                
                int total = 0;
                switch (choice) {
                    case 1:
                        total = num1 + num2;
                        break;
                    case 2:
                        total = num1 - num2;
                        break;
                    case 3:
                        total = num1 * num2;
                    break;
                    case 4:
                        total = num1 / num2;
                        break;
                    default:
                        System.out.println("Something went wrong.");
                        break;
                }
            String result = String.valueOf(total);
            System.out.println("The result is: " + result);
            
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