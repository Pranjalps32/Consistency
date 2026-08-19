public class BuyAndSaleStock {
    public static void main(String[] args) {
        int[] arr={23,45,67,89,98,45};
        int minprice=arr[0];
        int maxprofit=0;

        for(int i=1;i<arr.length;i++){
            minprice=Math.min(minprice,arr[i]);
            int profit =arr[i]-minprice;
            maxprofit=Math.max(maxprofit, profit);
        }
        System.out.println(maxprofit);
    }
}
