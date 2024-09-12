package ConditionalStatement;
import java.util.Scanner;

public class EvenOdd_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println(num+" That number is Even");
        }
        else{
            System.out.println(num+" That number is Odd");
        }
        
        System.out.println("you are check many value press run");
    }

}
