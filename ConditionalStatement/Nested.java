package ConditionalStatement;

import java.util.Scanner;

public class Nested {
    public static void main(String[] args){
        Scanner IN=new Scanner(System.in);
        System.out.println("Enter your age:- ");
        int age=IN.nextInt();
        if(age>=18){
            System.out.println("You can drive");
            if(age>45){
                System.out.println("Youe cannot Drive because you are old age:))");
            }
        }
        else{
            System.out.println("You are under1 ");
        }
    }
}
