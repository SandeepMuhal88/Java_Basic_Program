package Loops;
// import java.util.Scanner;

// public class NumericalPatter{

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number of Rows");
//         int r = sc.nextInt();
//         for (int i = 1; i <= r; i++) {

//             for (int j = 1; j <= r; j++) {
//                 System.out.print(j);
//             }
//             for(int k=1;k<=i-1;k++){
//                 System.out.print(k);
//             }
//             System.out.println();
//         }
//     }
// }

import java.util.Scanner;

public class Numericalpattern_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Rows");
        int r = sc.nextInt();
        for (int i = 1; i <= r; i++) {

            for (int j = 1; j <= r - i; j++) {
                System.out.print(j);
            }
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            for(int l=r-i;l>0;l--){
                System.out.print(l);
            }
            System.out.println();
        }
    }
}