public class SecondLarge {
    public static void main(String[] args) {
        int[] arr ={34,56,21,32,11,89,65,88};
        int secLarge=Integer.MIN_VALUE;
        int large=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large)
            {
                secLarge=large;
                large=arr[i];
                
            }
            else if (arr[i] > secLarge && arr[i] != large) {
                secLarge = arr[i];
            }
        }
        System.out.println(secLarge);
    }
    
}
