public class ZerosEnd {
    public static void zerosEnd(int[] arr){
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }
        }
        while(index<arr.length){
            arr[index]=0;
            index++;
        }
         
    }
    public static void main(String[] args) {
        int[] arr ={23,0,45,0,67,0,89,0,78,56,34};
        zerosEnd(arr);
        System.out.print("[ ");
          for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
            }
          System.out.print(" ]");
        
    }
}
