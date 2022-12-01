/*Sabrina and Theo’s Game-2
Requested files: Game.java (Download)
Maximum number of files: 5
Type of work: Individual work
Sabrina and Theo were friends. They felt very bored and decided to play a game with calendar and number of days. Sabrina will give the month and the year as input, and Theo wants to find the number of days in that month. Write a C program using switch case and help Sabrina to find the answer. You should check whether the given year is a leap year. If it is a leap year it will have 29 days in February.

Input & Output Format:

Input consists of two integers.

First input consists of  a month.

Second input consists of a year.

Output consists of a integer.


Sample Input:

3

1996

Sample Output:
Number of days is 31

*/
import java.util.Scanner;
public class Game2
{
public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int y=sc.nextInt();
       int i;
       int s=31;
       int m=29;
       int v=30;
       int w=28;
       switch(n)
       {
       case 1:
           if(y%4==0)
           {
                   System.out.printf("Number of days is %d",s);
               
           }
           else
           {
             System.out.printf("Number of days is %d",m);  
           }
           break;
            case 2:
           if(y%4==0)
           {
                
               System.out.printf("Number of days is %d",m);
               
           }
           else if(y%4==1)
           {
             System.out.printf("Number of days is %d",w);  
           }
           else
           {
               System.out.printf("Number of days is %d",v);
           }
           
           break;
         
            case 3:
           if(y%4==0)
           {
               
               System.out.printf("Number of days is %d",s);
               
           }
           else
           {
             System.out.printf("Number of days is %d",m);  
           }
           break;
            case 4:
           if(y%4==0)
           {
               
              
               System.out.printf("Number of days is %d",s);
               
           }
           else
           {
             System.out.printf("Number of days is %d",m);  
           }
           break;
            case 5:
           if(y%4==1)
           {
                
               System.out.printf("Number of days is %d",s);
               
           }
           else
           {
             System.out.printf("Number of days is %d",m);  
           }
           break;
            case 6:
           if(y%4==1)
           {
                
               System.out.printf("Number of days is %d",v);
               
           }
           else
           {
             System.out.printf("Number of days is %d",m);  
           }
           break;
            case 7:
           if(y%4==0)
           {
                
               System.out.printf("Number of days is %d",s);
               
           }
           else
           {
             System.out.printf("Number of days is %d",m);  
           }
           break;
            case 8:
           if(y%4==0)
           {
               
               System.out.printf("Number of days is %d",s);
               
           }
           else
           {
             System.out.printf("Number of days is %d",m);  
           }
           break;
            case 9:
           if(y%4==0)
           {
               
               
               System.out.printf("Number of days is %d",s);
               
           }
           else
           {
             System.out.printf("Number of days is %d",m);  
           }
           break;
            case 10:
           if(y%4==0)
           {
               
               System.out.printf("Number of days is %d",s);
               
           }
           else
           {
             System.out.printf("Number of days is %d",m);  
           }
           break;
            case 11:
           if(y%4==0)
           {
                
               System.out.printf("Number of days is %d",s);
               
           }
           else
           {
             System.out.printf("Number of days is %d",m);  
           }
           break;
            case 12:
           if(y%4==0)
           {
               
               System.out.printf("Number of days is %d",s);
               
           }
           else
           {
             System.out.printf("Number of days is %d",m);  
           }
       }  
       
   }
}
