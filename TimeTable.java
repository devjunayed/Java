package basicjava;

import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int m;
        System.out.print("Enter the time table no: ");
        m = input.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(m + " x " + i + " = " + m * i);
        }

    }
}
