public class MinCostToMakeOne {
    public static int minCost(int[] arr){
        int increments=0;
        for(int i=0;i<arr.length;i++){
            increments+=(arr[i]-1);
        }
        return increments;
    }
    public static void main(String[] args) {
         int[] arr={45,67,89,34,56,78,23,78,89,56};
         int k=minCost(arr);
         System.out.println("The minimum cost required will be "+k);
    }
}
    

