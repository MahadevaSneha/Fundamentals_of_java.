/*Student details II
Requested files: Student2.java (Download)
Type of work: Individual work
Write a Java program to create a class to get n number of student values as name, id, dept.

Hint: Create a new class with name as Stud, then declare required data members, then write a constructor to initialize the values and write a display() function to print the values. 

Sample input:

Mahes

1

ECE

Rahul

4

Mech

Sample output:

Students details:

Students Name:

Mahes

Rahul

Students ID:

1

4

Students Departments:

ECE
*/
import java.util.Scanner;
class Stud
{
    String name1,name2;
    int id1;
    String id2;
    String d1;
    String d2;
    Scanner sc=new Scanner(System.in);
    void display(){
       name1=sc.nextLine();
       id1=sc.nextInt();
       d1=sc.nextLine();
      name2=sc.nextLine();
       id2=sc.nextLine();
       d2=sc.next();
    }
}
class Student2 extends Stud
{
     public static void main(String args[])
     {
         Student2 s=new Student2();
         s.display();
         //s.display1();
         System.out.println("Students details:");
         System.out.printf("Students name: \n"+s.name1);
         System.out.println(""+s.name2);
         System.out.printf("Students ID: \n"+s.id1);
         System.out.println("\n"+s.id2);
         System.out.printf(" Students Department: \n"+s.d1);
         System.out.printf(""+s.d2);
     }
}
