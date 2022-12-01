/*Series X
Requested files: Series10.java (Download)
  Maximum number of files: 5
Type of work: Individual work
Write a program to generate the following series 95.0, 115.5, 138.0,..., 189.0 

Input format: 

The input containing an integer which denotes 'n' 

Output format:

Print the series and refer the sample output for formatting

Sample Input & Output:

5

95.0 115.5 138.0 162.5 189.0 

*/
import java.util.Scanner;

public class Series10
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        float value=95.0f,a=0;
        for(int i=0;i<num;i++){
            System.out.print(value+" ");
            value =value+(float)(20.5+a);
            a +=2;
        }
    }
} 
