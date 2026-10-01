public class MovingAverage {
    public static void main(String[] args) {
        int[] arr ={3,7,12,21,34};
        int n=3;
        for(int i=0;i<=arr.length-n;i++){
            double sum=0;
            for(int j=i;j<i+n;j++){
                 sum += arr[j];
            }
             double Average = sum/n;
             System.out.println(Average);

        }
    }
    
}
