public class ArrayLeaders {
    public static void main(String[] args) {
        int[] arr ={16,17,4,3,5,2};
       
        for(int i=0;i<arr.length;i++){
            int n=arr[i];
             int k=0;
            if(i==arr.length)
                {
                  System.out.println(n);
                 }
            for(int j=i+1;j<arr.length;j++){
                if(n<arr[j])
                {
                   k++;
                }
            }
            if(k<1)
                {
                  System.out.println(n);
                 }
        }
        
        
    }
    
}
