import java.util.Arrays;
public class RemoveDuplicates {
    public static void removeDuplicates(int[] arr){
          int index=0;
        Arrays.sort(arr);
        int[] arr1 =new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int n=arr[i];
            int k=0;
            for(int j=i+1;j<arr.length;j++){
                if(n==arr[j]){
                    k++;
                }
            }
            if(k==0){
               arr1[index]=n;
               index++;
            }
            
        }
        System.out.println("Printing array elements");
        System.out.print("[ ");
        for(int i=0;i<index;i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.print(" ]");
    }
    public static void removeDuplicatesOptimized(int[] arr){
        Arrays.sort(arr);
        int size=arr.length;
        int index=0;
        int[] arr1=new int[size];
        for(int i=0;i<size-1;i++){
            
            if(arr[i]!=arr[i+1]){
                arr1[index]=arr[i];
                index++;
            }
            else{
                continue;
            }
        }
        System.out.println("Printing array elements");
        System.out.print("[ ");
        for(int i=0;i<index;i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.print(" ]");

    }
    
    public static void main(String[] args) {
        int[] arr={45,67,89,34,56,78,23,78,89,56};
       // removeDuplicates(arr);
        removeDuplicatesOptimized(arr);
        
}
}
