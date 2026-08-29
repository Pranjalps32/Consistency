public class TwoSum {
    public static void main(String[] args) {
        int[] arr={2,4,5,6,7,3,2};
        int k=7;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i != j && arr[i] + arr[j] == k){
                    System.out.println(arr[i]+" + "+arr[j]+" = "+k);
                }
            }
        }
    }
    
}
