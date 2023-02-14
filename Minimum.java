/*Minimum Scalar Product
Requested files: Minimum.java (Download)
Maximum number of files: 5
Type of work: Individual work
You are given two vectors v1=(x1,x2,...,xn) and v2=(y1,y2,...,yn). The scalar product of these vectors is a single number, calculated as x1y1+x2y2+...+xnyn.
Suppose you are allowed to permute the coordinates of each vector as you wish. Choose two permutations such that the scalar product of your two new vectors is the smallest possible, and output that minimum scalar product.

Input & Output Format:

Input consists of 1 integer and two arrays.

First input consists of an size of an array.

second inputs consists of elements of two arrays.

Output consists of a one integer.

Sample Input:

3
1 3 5
2 4 1

Sample Output:
15


*/
import java.util.*;
public class Minimum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a1[]=new int[n];
        int a2[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a1[i]=sc.nextInt();
            a2[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;i<n;i++)
            {
                if(a2[i]>a2[j])
                {
                    int temp=a2[i];
                    a2[i]=a2[j];
                    a2[j]=temp;
                }
            }
        }
        for(int i=1;i<n-1;i++)
        {
            int m=1;
             m=m+a1[i]*a2[i];
            System.out.printf("%d",m);
        }
        
    }
}
