package JAVA_practice;

public class starPattern01 {
    public static void main(String[] args) {

        System.out.println(" 1-------------------");
        for ( int i=1 ;i<=4;i++){
            for(int j=1 ;j<=(5-i);j++)
                System.out.print("* ");
            System.out.println();
        }

        System.out.println("2-----------------");
        for ( int i=4;i>=1;i--){
            for (int j=1 ; j<=i;j++){
                System.out.print("* ");
                System.out.println();
            }

        }
        System.out.println("3-----------------------");
        for ( int i=1; i<=4;i++){
            for ( int j=4;j>=i;j--){
                System.out.print("* ");
                System.out.println();
            }
        }
        System.out.println("4-----------------");
        for ( int i=1 ; i<=5;i++){
            //loop to print the space
            for (int j =1 ; j<=(5-i);j++)
                System.out.print(" ");
            //loop to printing stars
            for ( int j=1 ;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }

        System.out.println("5-------------------");




    }
}
