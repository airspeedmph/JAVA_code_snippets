package java_practice;

import java.util.Scanner;

public class namePattern {
    public static void main(String[] args) {
//        System.out.println("enter a name ");
//        String name = new Scanner(System.in).next();
//        int len = name.length();
//        for ( int i =1 ; i <=len ;i++){
//            for ( int j=1;j<=len;j++){
//                System.out.print(name.charAt(j-1)+" ");
//            }
//            System.out.println();
//        }


//        System.out.println("------------------------------");
//
//        int a =0;
//        for (int i=1 ;i<=8;i++){
//            a=i+a;
//            int b =a;
//            for (int j =1;j<=i;j++){
//                System.out.print(b--+" ");
//
//            }
//            a=a;
//            System.out.println();
//
//        }

        System.out.println("---------------");

        for (int i=1;i<=5;i++){
            int num =4;
            int a =i;
            for (int j =1 ;j<=i;j++){
                System.out.print(a+" ");
                a+=num;
                num--;
            }
            System.out.println();

        }
    }
}
