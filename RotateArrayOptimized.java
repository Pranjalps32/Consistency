public class RotateArrayOptimized{
    public static void reverseArray(int[] arr,int from,int to ){
        int left=from;
        int right=to-1;

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
        int k=3;
        
            k=k%arr.length;
        //for left rotation
        //reverseArray(arr, 0, k);
        //reverseArray(arr, k, arr.length);
        //reverseArray(arr, 0, arr.length);
        //for left rotation
        reverseArray(arr, 0, arr.length-k);
        reverseArray(arr, arr.length-k, arr.length);
        reverseArray(arr, 0, arr.length);
        System.out.print("[ ");
          for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
            }
          System.out.print(" ]");
    }
}
    

