/*Remove first and last character in a string
Requested files: Removefirstandlast.java (Download)
Maximum number of files: 5
Type of work: Individual work

It's pretty straightforward. Your goal is to create a function that removes the first and last characters of a string. You're given one parameter, the original string. You don't have to worry about strings with less than two characters.

Sample Input:

CodeShahstra

Sample Output:

odeShahstr

*/import java.util.Scanner;
class Removefirstandlast{
	public static String
	removeFirstandLast(String str)
	{
		 str=str.substring(1,str.length()-1);
		 return str;
	}

public static void main(String args[])
	{
	    Scanner sc= new Scanner(System.in);
	    String str = sc.nextLine();
		System.out.print(removeFirstandLast(str));
	}
}

