/*Student details
Requested files: Student.java (Download)
Type of work: Individual work
Write a JAVA program to create a class to get a student’s details such as name, id, and department and print the same as output.

Hint: Create a new class with name as Stud, then declare required data members, then write a constructor to initialize the values and write a display() function to print the values. 

Sample Input:
Shankar
1
ECE

Sample Output:
Student details:
Student name: Shankar
Student ID: 1
Department: ECE

*/
import java.util.Scanner;
class Stud
{
    String name;
    int id;
    String d;
    Scanner sc=new Scanner(System.in);
    void display(){
    
        
       name=sc.nextLine();
       id=sc.nextInt();
       d=sc.next();
    }
}
class Student extends Stud
{
     public static void main(String args[])
     {
         Student s=new Student();
         s.display();
         System.out.println("Student details:");
         System.out.println("Student name: "+s.name);
         System.out.println("Student ID: "+s.id);
         System.out.println("Department: "+s.d);
     }
}
