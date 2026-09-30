public class SmallestElement {
    public static void main(String[] args) {
        int[] arr ={2,5,4,1,-2,8,9,6};
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
