package ConditionalStatement;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner K=new Scanner(System.in);
        System.out.print("Enter a number:-");
        int num=K.nextInt();
        if(num<10){
            System.out.println("You enter number is less than 10");
        }
        else{
            System.out.println("You enter number is Grater than 10");
        }

        
    }
    
}
