/*Splitting into Teams
Requested files: Split.java (Download)
Maximum number of files: 5
Type of work: Individual work
During the Physical Education hour, PET sir has decided to conduct some team games. He wants to split the students in the class into equal sized teams. In some cases, there may be some students who are left out from teams and he wanted to use the left out students to assist him in conducting the team games. For instance, if there are 50 students in the class and if the class has to be divided into 7 equal sized teams, 7 students will be there in each team and 1 student will be left out. PET sir asks your help to automate this team splitting task. Can you please help him out? 
Input Format: 
Input consists of 2 integers. 
The second integer corresponds to the number of teams. 
Output Format: 
Refer sample input and output for formatting specifications.
Sample Input :

60 

8

SAMPLE OUTPUT:

The number of students in each team is 7 and left out is 4*/
import java.util.Scanner;
public class Split
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int stu=sc.nextInt();
        int teams=sc.nextInt();
        int pt=stu/teams;
        int lf=stu%teams;
        System.out.printf("The number of students in each team is %d and left out is %d",pt,lf);

    }
}


