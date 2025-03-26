package JAVA_practice;

import java.util.Scanner;

public class PrimeNumber {

   static  Scanner enter = new Scanner(System.in);
    static int num = enter.nextInt();

    public static void main(String[] args) {
        if (isPrime ()){
            System.out.println(num + "is Prime");
        }else {
            System.out.println(num + "is not Prime");

        }

    }
    public static boolean isPrime(){

        if (num < 2 )
            return false ;
        for (int i =2 ; i<num ; i++)
            if (num %1==0)
                return false ;

        return true;

    }

}
