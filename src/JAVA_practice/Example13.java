package JAVA_practice;

public class Example13 {
    public static void main(String[] args) {
        System.out.println("main()");
        ArithmeticOperation obj = new ArithmeticOperation();
        LogicalOperation obj1 = new LogicalOperation();
        System.out.println(obj.addition(10, 20));
        System.out.println(obj.multiplication(10,20));
        System.out.println(obj1.and(true , false ));
        System.out.println(obj1.or(true , false ));
    }
}
class ArithmeticOperation{
    int addition (int num1 , int num2 ){
        return ( num1+ num2);

       // return num1;
    }
    int multiplication (int num1 , int num2 ){
        return ( num1* num2);



    }

}
class LogicalOperation {
    boolean and (boolean ip1 , boolean ip2 ){
        return (ip1 && ip2);

    }
    boolean or (boolean ip1 , boolean ip2 ){
        return (ip1 || ip2);

    }
}
