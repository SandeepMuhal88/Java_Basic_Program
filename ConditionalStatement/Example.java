package ConditionalStatement;
import java.util.Scanner;
public class Example{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:- ");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("Even Number...");
        }
        else{
            System.out.println("Odd NUmber");
        }
    }
}

// IF else-if Statement 
