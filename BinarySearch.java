import java.util.Scanner;
public class BinarySearch{
    public static int BSearch(int arr[],int key){
      int low=0, high=arr.length-1;
      while(low<=high){
         int mid=low+(high-low)/2;
         if (arr[mid]==key){
            return mid;
         }
         if(arr[mid]>key){
            high=mid-1;
         }
         else
            low=mid+1;
      }
      return -1;
    }
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter the size of array");
      int size=sc.nextInt();
      int []arr=new int[size];
      System.out.println("Enter the elements of array in sorted order");
      for(int i=0;i<size;i++){
           arr[i]=sc.nextInt();
      }
      System.out.println("printing array ");
      System.out.print("[ ");
      for(int i=0;i<size;i++){
           System.out.print(arr[i] + " ");
      }
       System.out.print(" ]");
       System.out.println("\n Enter the element you wanna search in array");
       int key=sc.nextInt();
       int result=BSearch(arr,key);
       if(result>=0)
        {System.out.println("Element found at "+result);}
       else
       { System.out.println("Not found");}
      sc.close();  
    }
}