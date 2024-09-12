package Loops;

// public class Nestedloops {
//     public static void main(String[] agrs){
//         for(int i=1;i<=4;i++){
//             for(int j=1;j<=4;j++){
//                 System.out.println(i+" "+j);
//             }
//         }
//     }
    
// }


// Patterning printing

import java.util.Scanner;

public class PatternPrint{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of Rows");
        int r=sc.nextInt();
        System.out.println("Enter the NUmber of Column:-");
        int c=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}