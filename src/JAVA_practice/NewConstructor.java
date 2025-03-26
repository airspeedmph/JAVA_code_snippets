package JAVA_practice;

public class NewConstructor {
    String name ;
    int studId;


    public static void main(String[] args) {
        NewConstructor n1 = new NewConstructor("Ramesh ", 34);

    }
    NewConstructor(String name , int studId ){
        this.name = name;

        this.studId= studId;
        System.out.println(name);
        System.out.println(studId);

    }
}
