import java.util.Scanner;
public class SelectionSort {
    public static void Selectionsort(int[] arr){
        for(int i=0;i<arr.length-1;i++)
        {
            int min_idx=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min_idx]>arr[j]){
                    min_idx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_idx];
            arr[min_idx]=temp;
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
      Selectionsort(arr);
      System.out.println("\nprinting array After sort");
      System.out.print("[ ");
      for(int i=0;i<size;i++){
           System.out.print(arr[i] + " ");
      }
      System.out.print(" ]");
        sc.close();
    }
    
}
