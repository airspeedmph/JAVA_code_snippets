package java_practice;

public class Alphabet {
    public static void main(String[] args) {
        char ch = 'B';
        String output =
                //this cndt check the character
        //is in a range of A to Z
                ( ch >=65 && ch <=90)?
                        //if cndt is true it returns operand 2
                        (ch + " is an Uppercase java_practice.Alphabet "):
                        //if cndt is a false it returns operand3
                        (ch + " is not an UpperCase java_practice.Alphabet ");
        System.out.println(output);
    }
}

