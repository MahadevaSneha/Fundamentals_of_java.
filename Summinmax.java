/*1-D array Question-2
Requested files: Summinmax.java (Download)
Maximum number of files: 5
Type of work: Individual work
Write a program that creates integer array of 10 elements, accepts values of arrays and Find Sum, Average, Min, Max.
Sample Input: 

Enter 10 array elements

1

2

3

4

5

6

7

8

9

10

Sample Output

Array: 

sum: 55

min: 1

max: 10

average : 5.5



*/
import java.util.Scanner;
public class Summinmax
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int min,max;
        float sum=0,avg=0;
        int a[]=new int[10];
        System.out.println("Enter 10 array elements");
        for(int i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Array:");
        for(int i=0;i<10;i++)
        {
            sum=sum+a[i];
        }
        System.out.printf("sum: %.0f\n",sum);
        min=a[0];
        for(int i=0;i<10;i++)
        {
            if(a[i]<min)
            min=a[i];
        }
         System.out.println("min: "+min);
         max=a[0];
          for(int i=0;i<10;i++)
        {
            if(a[i]>max)
            max=a[i];
        }
         System.out.println("max: "+max);
         System.out.printf("average : %.1f",sum/10);
    }
}
