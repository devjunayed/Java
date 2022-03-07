package basicjava;

import java.util.Scanner;

public class PrintEven {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int sum = 0, i, m, n;
        System.out.print("Enter initial number: ");
        m = input.nextInt();
        System.out.print("Enter final number: ");
        n = input.nextInt();

        for(i=m; i<=n; i++){
            if(i%2==0){
                sum = sum + i;
            }
        }
        System.out.println("Sum of even number: " + sum);
    }
}
