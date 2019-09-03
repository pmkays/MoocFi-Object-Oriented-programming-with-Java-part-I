
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        // So the program asks for student information from the user until the 
//        user gives a student an empty name. After the student info has been enteres, 
//        all the students are printed. From each inputted name-studentnumber-pair, 
//        the program should create a Student object. 
//        The program should store the students in an ArrayList which is defined as follows:
        while(true)
        {
            System.out.println("name:");
            String name = reader.nextLine();
            
            if(name.isEmpty())
            {
                break; 
            }
            
            System.out.println("studentnumber:");
            String number = reader.nextLine(); 
             
            Student pupil = new Student(name, number);
            list.add(pupil);
        }
        
        for(Student student: list)
        {
            System.out.println(list.toString());
        }
        
        System.out.println("Give search term: "); 
        String search = reader.nextLine(); 
        
        for(Student student: list)
        {
            if(student.getName().contains(search))
            {
                System.out.println("Result: ");
                System.out.println(student.toString());
            }
        }
              
    }
}
