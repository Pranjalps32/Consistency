// Doing the same  problem with three different approach
import java.util.Scanner;
public class Condition {
    public static void main(String[] args) {
        
    
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter time from 0 to 23 :");
    int x=sc.nextInt();

    //using ternary operator
    String result =(x < 12)?"Good Morning":"Good Afternoon";
    System.out.println(result);

    //Using If and else
        if(x<12){
            System.out.println("Good Morning");
        }
        else{
            System.out.println("Good Afternoon");
        }

    //using arr
     String[] arr ={"Good morning","Good Afternoon"};
     System.out.println(arr[x/12]);

     sc.close();
    }
}
