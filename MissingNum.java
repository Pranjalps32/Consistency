public class MissingNum{

    public static void missingNumber(int[] arr){
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]==arr[i-1]+1){
                continue;
            }
            else{
                System.out.println(arr[i]-1);
            }
        }
    }

    public static void missingNumberOptimized(int[] arr ,int n){
       
        int sum =(n*(n+1))/2;
        int actualsum=0;
        for(int i=0;i<arr.length;i++){
            actualsum+=arr[i];
        }
        if(actualsum==sum){
            System.out.println("No number is missing");
        }
        else{
            int missingnum=sum-actualsum;
            System.out.println(missingnum);
        }
    }

    public static void booleanMissingNumber(int[] arr,int n){
      
        boolean[] present = new boolean[n + 1];
        for(int i=0;i<arr.length;i++){
            present[arr[i]]=true;
        }

        for(int i=1;i<=n;i++){
            if(present[i]==false){
                System.out.print(i + " ");
            }
        }


    }


    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,7,8,10};
        int n=10;
        booleanMissingNumber(arr, n);
        
        
    }
}