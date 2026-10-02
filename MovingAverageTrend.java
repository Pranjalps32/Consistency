public class MovingAverageTrend {
    public static void main(String[] args) {

        double[] arr={69.849998, 72.900002, 74.449997, 77.300003, 75.050003, 74.349998, 75.449997, 76.300003, 7469.349998, 65.349998, 67.349998, 67.599998, 68.449997};
        int x=2, y=4;
        double prevdiff=0;
        int count=0;

        for(int i=0;i<=arr.length-y;i++){
            double sum=0;
            for(int j=i+y-x;j<i+y;j++){
                 sum += arr[j];
            }
             double FAverage = sum/x;
             System.out.println(FAverage);

              double sum1=0;
            for(int j=i;j<i+y;j++){
                 sum1 += arr[j];
            }
             double SAverage = sum1/y;
             System.out.println(SAverage);
             
            
             double diff=SAverage-FAverage;
             
             if(prevdiff>0 && diff <0 || prevdiff<0 && diff >0 ){
                  count++;
             }
             prevdiff=diff;
             

        }
        System.out.println(count);
    }
}
