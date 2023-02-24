 import java.util.Scanner;
class area{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		switch(str)
		{
			case "S":
			float s=sc.nextInt();
			float p=s+s+s+s;
			float a=s*s;
			System.out.printf("Perimeter: %.2f\n",p);
			System.out.printf("Area: %.2f",a);
			break;
			case "R":
			float l=sc.nextInt();
			float b=sc.nextInt();
			float p1=l+b+l+b;
			float a1=l*b;
			System.out.printf("Perimeter: %.2f\n",p1);
			System.out.printf("Area: %.2f",a1);
			break;
			case "C":
		double r=sc.nextInt();
			double p2=2*3.14*r;
			double a2=3.14*r*r;
			System.out.printf("Perimeter: %.2f\n",p2);
			System.out.printf("Area: %.2f",a2);
			break;
		}
		
	}
}
