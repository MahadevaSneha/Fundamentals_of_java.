/*Thinkful - Logic Drills: Traffic light
Requested files: Traffic.java (Download)
Maximum number of files: 5
Type of work: Individual work
DESCRIPTION:
You're writing code to control your town's traffic lights. You need a function to handle each change from green, to yellow, to red, and then to green again.

Complete the function that takes a string as an argument representing the current state of the light and returns a string representing the state the light should change to.

For example, when the input is green, output should be yellow.

INPUT 1:
red
OUTPUT 1:
green
INPUT 2:
green
OUTPUT 2:
yellow
INPUT 3:
yellow
OUTPUT 3:
red
*/
import java.util.*;
public class Traffic {

     public static String updateLight(String current) {
    //write your logic here
    String s=" ";
    switch(current)
    {
        case "red":
            s="green";
            break;
            case "green":
            s="yellow";
            break;
             case "yellow":
            s="red";
            break;
            
    }
    return s;
  }
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String current=sc.nextLine();
System.out.println(updateLight(current));
}}
