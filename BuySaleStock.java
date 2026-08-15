public class BuySaleStock {
    public static void buyAndSaleStocks(int[] arr){
        int minprice=arr[0];
        int maxprofit=0;
        int minpriceday=0;
        int buyday=0;
        int saleday =0;

        for(int i=0;i<arr.length;i++)
        {
           if(minprice>arr[i])
            {
              minprice=arr[i];
              minpriceday=i;
           }
           int profit = arr[i] - minprice;
           if(profit > maxprofit) {
                    maxprofit = profit;
                    saleday=i;
                    buyday=minpriceday;
                }
       }
       System.out.println("The best day to buy stock is day : "+buyday);
       System.out.println("The best day to sale stock is day : "+saleday);
       System.out.println("MaxProfit : "+maxprofit);
    }
    public static void main(String[] args) {
        int[] arr ={34,67,22,89,56,79};
        buyAndSaleStocks(arr);
        
    }
    
}
