package basicjava;

import java.util.Scanner;

public class FahrenheitToCels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cels, farn;

        System.out.print("Enter Fahrenheit: ");
        farn = input.nextDouble();

        cels = ((double)5/9)*(farn - 32);
        System.out.println("Celcius: " + cels);
        
    }
    
}
