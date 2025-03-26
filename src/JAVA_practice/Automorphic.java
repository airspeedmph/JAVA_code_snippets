package JAVA_practice;

import java.util.Scanner;

public class Automorphic {
    public static void main(String[] args) {
        System.out.println("enter a number ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int dup =num;
        int cnt =0;
        while (num>0){
            cnt++;
            num/=10;

        }

        int div=1;
        for (int i=1; i<=cnt;i++){
            div=div*10;
        }
        System.out.println(((dup+dup)%div)==dup?
                dup+"is automorphic":
                dup+"is not automorphic");
    }
}
