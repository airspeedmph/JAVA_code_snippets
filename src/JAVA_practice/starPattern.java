package java_practice;

public class starPattern {
    public static void main(String[] args) {

//        for (int i =1 ; i<=4;i++){
//            for (int j =1 ; j<=4;j++){
//                if (i%2!=0)
//                    System.out.print("1 ");
//                else
//                    System.out.print("0 ");
//            }
//            System.out.println();
//        }
//        System.out.println("hollow pattern ");
//        for (int i =5;i>=1;i--){
//            for (int s =1 ;s<=(s-i);s++){
//                System.out.print(" ");
//            }
//            for (int j=1 ;j<=i;j++) {
//                if (i == 5 || j == 1) {
//                    System.out.print("* ");
//
//                } else {
//                    System.out.print("  ");
//                }
//            }
//                for (int j=2 ; j<=i;j++){
//                    if (i==j||i==5){
//                        System.out.print("* ");
//                    }
//                    else {
//                        System.out.print(" ");
//                    }
//
//                }
//            System.out.println();
//            }
//        }

        System.out.println("-----------------------");
        System.out.println();
        for (int i=1 ; i<=5;i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || i == j) {
                    System.out.print("* ");

                } else {
                    System.out.print(" ");
                }
                System.out.println();

            }
        }
            for (int i =4 ;i>=1;i--){
                for (int j=1;j<=i;j++){
                    if (j==1||i==j){
                        System.out.print("* ");
                    }else {
                        System.out.print(" ");
                    }
                    System.out.println();

                }
            }
        }

    }



