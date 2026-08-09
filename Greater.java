import java.util.*;
public class Greater{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers to fing greater");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b){
            if(a>c){
            System.out.println("The greater number is "+a);
            }
            else{
            System.out.println("The greater number is "+c);
            }
        }
         else{
            if(b>c){
            System.out.println("The greater number is "+b);
            }
            else{
            System.out.println("The greater number is "+c);
            }
        }
        sc.close();
    }
}
