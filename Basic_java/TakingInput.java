package Basic_java;

import java.util.Scanner;

public class TakingInput {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Taking Input in java prrogramming");
        System.out.println("Enter Integer NUmber:-");
        int num=sc.nextInt();
        System.out.println("Enter Float value:-");
        float num1=sc.nextFloat();
        System.out.println("Enter String :-");
        String s=sc.nextLine();
        System.out.println(s);
        double K=sc.nextDouble();
    }
    
}
