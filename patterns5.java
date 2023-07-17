// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1|| i==n||j==1|| j==n|| i==j|| n+1-i==j){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
                
            }
            System.out.println();
        }
        
    }
}
