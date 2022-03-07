package basicjava;

import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int number;
        System.out.print("Enter any number: ");
        number = input.nextInt();
        
        System.out.println("Entered number is: " + number);
    }
}
