package JAVA_practice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.println(" enter the num ");
        int num = enter.nextInt();
        int fact = findFactorial(num);
        System.out.println(" factorial + "+fact );
    }

    public static int findFactorial(int a ){
        int fact  = 1 ;
        for (int i =a ; i>0;i--){
            fact *=i;

        }
        return fact;

    }
}
