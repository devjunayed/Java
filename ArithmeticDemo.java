package basicjava;
import java.util.Scanner;

public class ArithmeticDemo {
    public static void main(String[] args) {
        //Declaring the variables
        int num1, num2, result;

        //Declaring the scanner class
        Scanner input = new Scanner(System.in);

        //Getting the first input from the user
        System.out.print("Enter your first number: ");
        num1 = input.nextInt();

        //Getting the second input from the user
        System.out.print("Enter your Second number: ");
        num2 = input.nextInt();

        //Adding two number 
        result = num1 + num2;
        System.out.println("Summation: " + result);

        //Substracting two number
        result = num1 - num2;
        System.out.println("Subtraction: " + result);

        //Multiplication of two number
        result = num1 * num2;
        System.out.println("Multiplication: " + result);

        //Division of two number
        double result2 = (double) num1/num2;
        System.out.println("Division: " + result2);

        //Rmainder of two number
        result = num1 % num2;
        System.out.println("Remainder: " + result);
    }
    
}
