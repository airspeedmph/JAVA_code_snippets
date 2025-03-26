package java_practice;

import java.util.Scanner;
public class TempCalc {




        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.println("                  *******Temperature Converter*********");
            System.out.println();
            System.out.println("Enter your temperature in degree celcius");
            float cel = sc.nextFloat();
            System.out.println("1.Kelvin 2.Fahrenheit 3. Rankine 4.Reamur  ");
            System.out.println("Enter an option");
            int option = sc.nextInt();


            if( option==1){
                float kelvin =cel+273.15f;
                System.out.println(cel + "c = "+kelvin+"K");

            }
            else if (option==2){
                float fah = (cel +(9/5f))+32;
                System.out.println(cel + "c = "+fah+"f");

            }else {
                System.out.println("wrong option ");
            }
        }
    }

