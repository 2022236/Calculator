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
       
        System.out.println("This is a calculator.");
        try {
        BufferedReader sc = new BufferedReader (new InputStreamReader(System.in));
        
        System.out.println("Enter the first number:");
        String firstNum = sc.readLine();
        System.out.println("Enter the second number:");
        String secondNum = sc.readLine();
        
        int num1 = Integer.parseInt(firstNum);
        int num2 = Integer.parseInt(secondNum);
        int total = num1 + num2;
        
        String result = String.valueOf(total);
        
        System.out.println("The sum is: " + result);
        sc.close();

       } catch (NumberFormatException e) {
            System.out.println("Please enter a valid input.");
        }  
    }  
}