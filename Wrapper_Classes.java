import java.util.Scanner;


public class Wrapper_Classes{
    public static void main(String[] args){ 
        Scanner scan = new Scanner (System.in);

        Person1 p1 = new Person1();
        Person2 p2 = new Person2();

        p1.Age = 31; 
        p1.Height = 1.5;
        p1.firstName = "John";
        p1.lastName= "Hancock";

        p2.Age = 25; 
        p2.Height = 2.0;
        p2.firstName= "John";
        p2.lastName= "Ross";


        System.out.println(" Lets check if the Age is the same? ");
        System.out.println(p1.getAge()==p2.getAge());
        System.out.println("\n");
        
        System.out.println(" Lets check if the Height is the same? ");
        System.out.println(p1.getHeight()<p2.getHeight());
        System.out.println("\n");

        System.out.println(" Lets check if the first name is the same? ");
        System.out.println(p1.getfirstName()==p2.getfirstName());
        System.out.println("\n");

        System.out.println(" Lets check if the last name is the same? ");
        System.out.println(p1.getlastName()==p2.getlastName());
        System.out.println("\n");
    }
}


/*
public class Person1{
    Integer Age = 31; 
    Double Height = 1.5;
    String firstName = "John";
    String lastName= "Hancock";

}

public class Person2{
    int Age = 25; 
    double Height = 2.0;
    String firstName= "John";
    String lastName= "Ross";

}
*/