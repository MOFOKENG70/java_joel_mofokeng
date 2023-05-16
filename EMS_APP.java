/*
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class Lists_And_Arraylists1{  


    public static void main(String[] args){   
        Scanner scan= new Scanner(System.in);     
        //System.out.println();
                   
        
        scan.close();
    }
}
*/

import java.util.Scanner;
import java.util.function.ToIntFunction;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class EMS_APP{  


    public static void main(String[] args){   
        Scanner s= new Scanner(System.in);
        List<String>FullName= new ArrayList<String>();
        List<String>EmployeeID= new ArrayList<String>();
        List<String>Designation= new ArrayList<String>();
        List<String>Experience= new ArrayList<String>();
        List<Integer>Age= new ArrayList<Integer>();

        //System.out.println();
         
        //NEW ENTRIES
        //___________________________________________________________________________________________________
        System.out.println("Enter full name.");
        String fullName= s.nextLine();

        System.out.println("Enter employee ID.");
        String employeeId=s.nextLine();

        System.out.println("Enter employee Designation.");
        String designation= s.nextLine();

        System.out.println("Enter employee Experience.");
        String experience= s.nextLine();

        System.out.println("Enter employee age.");
        int age= s.nextInt();

        FullName.add(fullName);
        EmployeeID.add(employeeId);
        Designation.add(designation);
        Experience.add(experience);
        Age.add(age);

        System.out.println("Name: "+fullName+"\n"+"Employee ID: "+employeeId+"\n"+"Designation: "+designation+"\n"+"Experience: "+experience+"\n"+"Age: "+age);
        System.out.println("Data added!");
        //________________________________________________________________________________________________________
        //SEARCH FOR A RECEORD
        System.out.println("Enter the name of the record");
        s.nextLine();
        String record=s.nextLine();
        if(FullName.indexOf(record) != -1)
        {
            System.out.println("Name: "+fullName+"\n"+"Employee ID: "+employeeId+"\n"+"Designation: "+designation+"\n"+"Experience: "+experience+"\n"+"Age: "+age);
        }
        //________________________________________________________________________________________________________
        //DELETE ENTRIES
        
        System.out.println("Please enter the name of the person whoms records you want to delete.");
        s.nextLine();
        String delete=s.nextLine();

        if(FullName.indexOf(delete)!=-1)
        {
            FullName.remove(FullName.indexOf(delete));
            EmployeeID.remove(EmployeeID.indexOf(delete));
            Designation.remove(Designation.indexOf(delete));
            Experience.remove(Experience.indexOf(delete));
            Age.remove(FullName.indexOf(delete));
            System.out.println("Data has been deleted!");
        }
        
        s.close();
    }
}