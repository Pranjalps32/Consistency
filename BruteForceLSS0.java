//Brute force approach to fing longest subarray with sum Zero
public class BruteForceLSS0 {
    public static void lss(int[] arr){
        int maxLength=0;
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==0){
                    int length=j-i+1;
                    if(maxLength<length){
                        maxLength=length;
                         start=i;
                         end=j;

                    }
                }
            }
        }
        System.out.println(maxLength);
        System.out.print("[ ");
        for(int i=start;i<=end;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print(" ]");
    }
    public static void main(String[] args) {
        int[] arr ={15,-2,2,-8,1,7,10,23};

        lss(arr);
    }
    
}
