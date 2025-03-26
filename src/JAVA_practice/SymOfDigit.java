package java_practice;

import java.util.Scanner;

public class SymOfDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int num = sc.nextInt();
        int sum = 0;

        for (int i= num ; i>0; i/=10){
            int rem = i %10;
            sum+=rem;
        }
        System.out.println("sum of digit of "+num+"is " +sum);
    }
}
