 import java.util.*;
public class LinearSearch {
    public static int Search(int arr[],int key){
       
       for(int i=0;i<arr.length-1;i++){
         if (key==arr[i]){
            return i;
         }
           
        }

        return -1;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of array");
        int size=sc.nextInt();
        int [] arr=new int[size];
        System.out.println("Enter array elements");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
         System.out.println("Printing array elements");
         System.out.print("[ ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print(" ]\n");
        System.out.println("Enter element you wanna search in array");
        int key =sc.nextInt();
        int f= Search(arr, key);
         System.out.println("Element found at "+ f);
        sc.close();
    }
    
}


