package JAVA_practice;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("enter a number ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //int num =153;
        int dup = num;
        int dup1 =num;
        int count =0;
        int sum = 0;
        while (num>0){
            count++;
            num/=10;

        }
        while (dup>0){
            int rem=dup%10;
            int op=1;
            for (int i=1;i<=count;i++){
                op=op*rem;

            }
            sum+=op;
            dup/=10;

        }
        if (dup1==sum){
            System.out.println(dup1 + "is a armstrong number ");

        } else{

        System.out.println(dup1 + " is not an armstrong number ");
    }
}}
