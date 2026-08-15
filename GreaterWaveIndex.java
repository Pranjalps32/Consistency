public class GreaterWaveIndex {
    public static void greaterWaveIndex(int[] arr){
        for(int i=1;i<arr.length-1;i+=2){
            if(arr[i]<arr[i-1]){
                int temp=arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=temp;
            }
            if(arr[i]<arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={34,23,56,67,45,32};
        greaterWaveIndex(arr);
        System.out.print("\n[ ");
          for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
            }
        System.out.print(" ]");
    }
    
}
