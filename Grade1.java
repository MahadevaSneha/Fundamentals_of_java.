/*Overall mark calculator
Requested files: Grade.java (Download)
Maximum number of files: 5
Type of work: Individual work

One homework question basically asks to design a grade calculator using methods by prompting the user for a mark, the max mark possible, the weighting of that test, and then producing a final score for that test. eg. (50/35)*75% = overall mark

Sample input-1

35

50

7.5

Sample output-1

7.5
*/
import java.util.Scanner;
public class Grade
{
    public static void main(String[] args)
    {
        
        Scanner in = new Scanner(System.in);
        in.hasNextInt();
        int score1 = in.nextInt();

        in.hasNextInt();
        int maxMark = in.nextInt();

        in.hasNextInt();
        double weighting = in.nextDouble();       
        weighting=scoreCalc(score1,maxMark,weighting);
        System.out.println(weighting);
       
    }

    public static double scoreCalc (int score1, int maxMark, double weighting)
    {
       weighting=(long)(maxMark/score1)*weighting;
        return weighting;
    }
}
