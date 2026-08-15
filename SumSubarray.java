public class SumSubarray {
    public static int subarraySum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            
            for(int j=i;j<arr.length;j++){
                 
                 for(int k=i ; k<=j ;k++){
                     sum+=arr[k];
                 }
                 
            }
            
        }
        return sum;
    }
    public static int subarraySumOptimized(int[] arr){
        int totalsum=0;
        
        for(int i=0;i<arr.length;i++){
            int currentsum=0;
            for(int j=i;j<arr.length;j++){
                 currentsum += arr[j];

                 totalsum+=currentsum;
            }
            
        }
        return totalsum;
    }
    public static void main(String[] args) {
        int[] arr ={23,45,67,89,78,56,34};
        int result=subarraySumOptimized(arr);
        System.out.println(result);
    }
    
}
