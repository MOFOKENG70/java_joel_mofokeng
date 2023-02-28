import java.util.Scanner;       //use this or always qualify the name like java.util.Scanner.Scanner

public class HomeWork1{                                 
    public static void main(String[] args){  
        Scanner scanner = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        int sum;

        System.out.println("What is your name: "); 
        String name =scanner.nextLine();

        System.out.println("What is your last name: "); 
        String lastName =scanner.nextLine();
        
        System.out.println("Please enter your first number: ");
        firstNumber =scanner.nextInt();


        System.out.println("What is your second number: ");
        secondNumber =scanner.nextInt();

        
        sum =firstNumber+secondNumber;
        System.out.println("Ok! "+name+" "+lastName+" .The sum of the numbers are: "+sum);
        
    }
}