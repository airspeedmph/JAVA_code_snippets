package JAVA_practice;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
//        long num = 1259060977;
//        long num1 = num;
//        int pos = 1;
//        long sum = 0;
//        while (num>0){
//            long rem = num%10;
//            sum+=(rem+pos++);
//            num/=10;
//
//        }
//        System.out.println((sum%11)==0?
//                num1+"is valid ISBN number":
//                num1+"is not a valid ISBN number ");

//
//        System.out.println("-------------------------------");
//        int num=10;
//        int sqr = num*num;
//        int sum = 0;
//        while (sqr>0){
//            sum+=(sqr%10);
//                    sqr/=10;
//
//        }
//        if (sum==num){
//            System.out.println(num+"is neon number");
//        }else {
//            System.out.println(num+"is not neon number");
//        }

        System.out.println("-------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int num = sc.nextInt();
        int sqrt = 0;

        for (int i=1 ; i<=(num/2);i++){
            int pro =i*i;
            if (pro ==num){
                sqrt =i;
                break;
            }
            if (pro>num){
                break;
            }
        }
        if (sqrt !=0){
            System.out.println(num+ "perfect sqrt is "+sqrt);

        }else {
            System.out.println(num+"doesnt have perfect sqrt");
        }
    }
}
