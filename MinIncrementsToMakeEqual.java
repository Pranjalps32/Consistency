public class MinIncrementsToMakeEqual {
    public static int minIncrement(int[] arr){
        int max=arr[0];
        for(int i=0;i< arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        int increments=0;
        for(int i=0;i<arr.length;i++){
            increments+=(max-arr[i]);
        }
        return increments;
    }
    public static void main(String[] args) {
         int[] arr={45,67,89,34,56,78,23,78,89,56};
         int k=minIncrement(arr);
         System.out.println("The minimum increments required will be "+k);
    }
}
