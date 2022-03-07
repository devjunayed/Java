package basicjava;

import java.util.Scanner;

public class CelsToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double cels, farn;

        System.out.print("Celcius: ");
        cels = input.nextDouble();

        farn = (((double)9/5)*cels)+32;
        System.out.println("Fahrenheit: " + farn);
        
    }
}
