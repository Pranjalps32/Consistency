import java.util.Scanner;

public class InsertionSort {
    public static void Insertionsort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int j=i-1;
            int key =arr[i];

            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
      int size=sc.nextInt();
      int []arr=new int[size];
      System.out.println("Enter the elements of array");
      for(int i=0;i<size;i++){
           arr[i]=sc.nextInt();
      }
      System.out.println("printing array Before sort");
      System.out.print("[ ");
      for(int i=0;i<size;i++){
           System.out.print(arr[i] + " ");
      }
      System.out.print(" ]");
      Insertionsort(arr);
      System.out.println("\nprinting array After sort");
      System.out.print("[ ");
      for(int i=0;i<size;i++){
           System.out.print(arr[i] + " ");
      }
      System.out.print(" ]");
        sc.close();
    }
}
