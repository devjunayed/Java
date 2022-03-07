package basicjava;

import java.util.Scanner;

public class Loop1Demo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sum = 0, m, n;

        System.out.print("Enter initial number: ");
        m = input.nextInt();
        System.out.print("Enter Final number: ");
        n = input.nextInt();


        for (int i = m; i<=n;i++){
            sum = sum + i;
        }

        System.out.println("sum = " + sum);
    }
    
}
