/*Students Marks
Requested files: Student.java (Download)
Maximum number of files: 5
Type of work: Individual work
In school, the teacher wants to calculate the subject marks of the student. she can do it by manual but the number of students in the class was around 250. she wants to calculate the specific subject marks for individual students in the class. Because she wanted to highlight the important subject marks to their parents in the parents-teachers association meeting. Can you help her to calculate the subject marks by writing code in java program?

Input Format

First line consist of student roll number.

second and third lines consist of subject1 and subject2 marks.

Output Format

Total marks of subjects.

Sample Input

5

10

20

Sample Output

Roll Number Is:

5

Subject 1:10

Subject 2:20

Total:30

*/
import java.util.Scanner;
class Sub
{
     Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int sub1=sc.nextInt();
    int sub2=sc.nextInt();
     int sum=sub1+sub2;
}
class Student extends Sub
{
    public static void main(String args[])
    {
        Student s=new Student();
        System.out.println("Roll Number Is\n:"+s.r);
        System.out.println("Subject 1:"+s.sub1);
        System.out.println("Subject 2:"+s.sub2);
        System.out.println("Total:"+s.sum);
        
    }
}
