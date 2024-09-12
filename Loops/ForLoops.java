package Loops;

import java.util.Scanner;
public class ForLoops{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:- ");
        int n=sc.nextInt();
        System.out.println("Table is here:-");
        for(int num=n;num<=n*10;num=num+n){
            
            System.out.println(num);
        }
    }
}
// import java.util.Scanner;

// public class MultiplicationTable {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = scanner.nextInt();

//         System.out.println("Multiplication Table of " + number);
//         System.out.println("-------------------------");

//         for (int i = 1; i <= 10; i++) {
//             int result = number * i;
//             System.out.println(number + " x " + i + " = " + result);
//         }
//     }
// }
