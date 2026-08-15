public class ReverseArray {
    public static void reverseArray(int[] arr){
          System.out.print("[ ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
          System.out.print(" ]");
    }
    public static void reversedArray(int[] arr){
        int left=0;
        int right=arr.length-1;

        while(left<right){
            int temp =arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] arr={45,67,89,34,56,78,23,78,89,56};
         System.out.print("Printing array before reverse\n[ ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
          System.out.print(" ]");
          System.out.print("\nPrinting array after reverse\n");
          //reverseArray(arr);
          reversedArray(arr);
         System.out.print("[ ");
          for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
            }
          System.out.print(" ]");
    }
    
}
