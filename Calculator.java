// This will be a rudimentary calculator that takes two numbers as input, as well as an operator.
// The operation will be performed on the two numbers, and the result will be given as a double.
// This calculator will ask for user input for two separate numbers, as well as the desired operation.
// This currently supports the following operations: +, -, * or x, /

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        char mathOperator;
        double result = 0.0; // if the answer is not a whole number, we'll need to display it as a double

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        firstNumber = scan.nextInt();
        System.out.println("Enter the second number: ");
        secondNumber = scan.nextInt();
        System.out.println("Enter the desired operation as a character: ");
        System.out.println("Addition, subtraction, multiplication and division are supported.");
        //scan the 0th character.
        mathOperator = scan.next().charAt(0);

        //we can use a switch statement for our specific cases
        //barring that, we can use elif statements to spit out an error if it doesn't work at first.
        switch (mathOperator){
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case 'x':
                result = firstNumber * secondNumber;
                break;
            case '/':
                result = firstNumber / secondNumber;
                break;
            }
        System.out.println("The result of " + firstNumber + " " + mathOperator + ' ' + secondNumber + " is");
        System.out.println(result);
    }
}
