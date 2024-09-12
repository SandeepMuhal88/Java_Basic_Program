import java.util.Scanner;

public class StringInputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        System.out.println("You entered: " + input);
    }
}




// import java.util.ArrayList;

// public class Reverse {
//     static void reverseList(ArrayList<Integer> list){
//         int i=0;
//         int j=list.size()-1;
//         while(i<j){
//             Integer Temp=Integer.valueOf(list.get(i));
//             list.set(i,list.get(j));
//             list.set(j,list.get(Temp));
//             i++;
//             j--;

//         }
//     }

//     public static void main(String [] args){
//         ArrayList<Integer> list=new ArrayList<>();
//         list.add(0);
//         list.add(10);
//         list.add(3);
//         list.add(5);
//         list.add(22);
//         list.add(10);
//         list.add(15);
//         System.out.println("Original List:-"+list);
//         reverseList(list);
//         System.out.println("Reverse List is here:-"+list);

//     }
// }























