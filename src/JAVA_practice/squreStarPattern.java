package java_practice;

import java.util.Scanner;

public class squreStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iter = sc.nextInt();
        for (int i = 1;i<=iter ; i ++){
            for (int j =1 ; j<=iter;j++){
                System.out.print(j+" ");
//                System.out.println();

            }
            System.out.println();

        }


    }

}
