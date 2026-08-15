public class RotateArray {
    public static void rotateArray(int[] arr){
        int k=2,j=0;
        int[] arr1=new int[k];
        int[] arr2=new int[arr.length-k];
        for (int i=0;i<k ;i++){
            arr1[j]=arr[i];
            j++;
        }
        int l=0;
        for (int i=k;i<arr.length ;i++){
            arr2[l]=arr[i];
            l++;
        }
         int[] result =new int[arr.length];
         int index=0;
         for(int i=0;i<arr2.length;i++){
            result[index]=arr2[i];
            index++;
         }
         for(int i=0;i<arr1.length;i++){
            result[index]=arr1[i];
            index++;
         }
        System.out.print("[ ");
          for(int i=0;i<result.length;i++){
            System.out.print(result[i] + " ");
            }
          System.out.print(" ]");
         

    }
    public static void main(String[] args) {
        int[] arr ={23,45,67,89,78,56,34};
        rotateArray(arr);
        
    }
}
