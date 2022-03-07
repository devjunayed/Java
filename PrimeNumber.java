package basicjava;

import java.util.Scanner;

public class PrimeNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num, flag = 0;

        System.out.print("Enter any positive integer: ");
        num = input.nextInt();

        for(int i = 2; i < num; i++){
            if(num % i==0){
                flag++;
                break;
            }
        }

        if(flag==0){
            System.out.println(num + " is a prime number");
        }else{
            System.out.println(num + " is not a prime number");
        }
    }
}