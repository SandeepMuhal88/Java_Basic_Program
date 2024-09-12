 package Loops;
import java.util.*;
public class ConverionDecimaltobinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Decimal NUmber:- ");
        int decimal_number=sc.nextInt();
        int ans=0;  //binary number
        int Y=1;   //Power of 10
        while(decimal_number>0){
            int parity=decimal_number%2;
            ans+=(parity*Y);
            Y*=10;
            decimal_number/=2;

        }
        System.out.println(ans);

    }
    
}
