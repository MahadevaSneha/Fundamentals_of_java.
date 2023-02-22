/*
Tomb of Queen Nefertiti
Requested files: Tomb.java (Download)
Type of work: Individual work
Egyptian Pyramids were constructed around 2500 – 3000 BC, by using large Cubic blocks placed in a perfect mathematical way. Researchers are still struggling
to find out how these pyramids were constructed without modern day technologies. We are currently having a task to find out how many blocks needed to
construct a pyramid of certain dimensions. Although there are lot of calculations involved let take some basic assumptions and start working.
1. Each block is 5*5*5 ft. in dimensions.
2. The base of Pyramid is Square with length of each side in feet as X (user defined).
3. Find the actual dimensions of Pyramid i.e Length, Width and height.
4. Find number of blocks required to construct that pyramid.
sample input: 
enter

100

Sample output:

total blocks are :: 39
*/
import java.util.Scanner;
class Tomb{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter");
        int d=sc.nextInt();
        int sum=5;
        int x=sum+sum+sum+sum;
        System.out.printf("total blocks are ::"+(2*x-1));
    }
}
