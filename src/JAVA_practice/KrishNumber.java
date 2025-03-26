package JAVA_practice;

import java.util.Scanner;

public class KrishNumber {
    public static void main(String[] args) {
//        System.out.println(" enter a number ");
//        System.out.println("enter a number ");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();

        for(int q=1 ; q<=999999999 ; q++) {
            int num = q;
            int dup = num;
            int sum = 0;
            while (num > 0) {
                int rem = num % 10;
                int fact = 1;
                for (int i = 1; i <= rem; i++) {
                    fact *= i;

                }
                sum += fact;
                num /= 10;

            }
            System.out.println(sum == dup ? dup + "is krish number " : dup + "is not a krish number ");

        }
    }
}
