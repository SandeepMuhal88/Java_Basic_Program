package Loops;
// import java.util.Scanner;
// public class Spacepattern {

//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter number of Rows");
//         int r=sc.nextInt();
//         System.out.println("Enter the NUmber of Column:-");
//         int c=sc.nextInt();
//         for(int i=1;i<=r;i++){
//             for(int j=1;j<=c;j++){
//                 if(i==1||i==r||j==1||j==c){
//                 System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }



import java.util.Scanner;
public class Spacepattern {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of Rows");
        int r=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

