package basicjava;

import java.util.Scanner;

public class Series1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n, sum = 0;

        System.out.print("Enter the last number: ");
        n = input.nextInt();

        for(int i = 1; i<=n; i = i + 2){
            System.out.print(i + " ");
            sum = sum + i;
        }
        System.out.println("\n" + sum);

    }
    
}
