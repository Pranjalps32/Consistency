public class SinglesAmongDoubles {
    public static void singleAmongDouble(int[] arr){
        
        int[] result =new int[arr.length];
        int index=0;
        for(int i=0;i<arr.length;i++)
        {
            int k=0;
            for(int j=0;j<arr.length;j++)
            {
                
                if(arr[i]==arr[j]){
                    k++;
                }
            }
            if(k==1){
                result[index]=arr[i];
                index++;
            }
        }
        System.out.print("\n[ ");
          for(int i=0;i<index;i++){
            System.out.print(result[i] + " ");
            }
        System.out.print(" ]");
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,1,3,3,4,5,1};
        singleAmongDouble(arr);
    }
}
