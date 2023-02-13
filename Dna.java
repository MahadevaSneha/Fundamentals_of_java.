/*DNA to RNA Conversion
Requested files: Dna.java (Download)
Maximum number of files: 5
Type of work: Individual work
Deoxyribonucleic acid, DNA is the primary information storage molecule in biological systems. It is composed of four nucleic acid bases Guanine ('G'), Cytosine ('C'), Adenine ('A'), and Thymine ('T').

Ribonucleic acid, RNA, is the primary messenger molecule in cells. RNA differs slightly from DNA its chemical structure and contains no Thymine. In RNA Thymine is replaced by another nucleic acid Uracil ('U').

Create a function which translates a given DNA string into RNA.

For example:

"GCAT"  =>  "GCAU"import java.util.*;
public class Dna {
    public static String dnaToRna(String dna) 
    {
        String str=dna.replace('T','U');
        return str;
    } 


public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String a=sc.next();
System.out.println(dnaToRna(a));
}}
INPUT 1:
MATBAT
OUTPUT 1:
MAUBAU*/
