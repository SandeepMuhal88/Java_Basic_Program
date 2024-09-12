package Loops;

import java.util.*;
public class ConversionBinary {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter binary number:-");
        int binary_Number= sc.nextInt();
        int ans=0; // convertdecimal
        int X=1;  // 2^0=1 power of 2
        while(binary_Number>0){
            int unit_digit=binary_Number%10;
            ans+=(unit_digit+X);
            binary_Number/=10;
            X*=2;
        }
        System.out.println(ans);


    }
    
}