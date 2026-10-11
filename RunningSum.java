public class RunningSum {
    public static int[] Rsum(int[] arr){
        int[] ans = new int[arr.length];
           int j=0;
        while(j<arr.length){
            int sum=0;
        for(int i=0;i<=j;i++){
            sum+=arr[i];   
        }
        ans[j]=sum;
        j++;
      }
     for(int i=0;i<ans.length;i++){
           System.out.print(ans[i] + " ");  
        }

        return ans;
    }
    public static int[] Rsumoptimized(int[] arr){
        int[] ans = new int[arr.length];
     
     int k=0 , sm=0;
     int j=0;
     while(j<=k && j<arr.length){
           sm += arr[j];
           ans[j]=sm;
           j++;
           k++;
     }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4};
        
      int[] ans = Rsumoptimized(arr);    
     for(int i=0;i<ans.length;i++){
           System.out.print(ans[i] + " ");  
        }

    }
}
