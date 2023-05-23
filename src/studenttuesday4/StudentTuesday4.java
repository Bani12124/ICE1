package studenttuesday4;

import java.util.Scanner;

/**
 * This class does this and that
 * @author Mehrdad Iravani
*/

public class StudentTuesday4{
    
    public static void main(String[] args){
        
        Student[] students = new Student[5]; //I changed the array size to 5 at 6:23pm
        
        Scanner keyboard = new Scanner(System.in);
        
        for (int i=0; i < students.length; i++){
            
            System.out.println("Enter Student's name:");
            
            String name;
            
            name = keyboard.nextLine();
            
            Student student = new Student(name);
            
            students[i] = student;
            
        }
        
        System.out.println("Printing the students");
        
        for(Student student: students){
            System.out.println(student.getName());
        }
    }
}
