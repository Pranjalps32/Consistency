import java.util.HashMap;

public class ElementFrequency {
    public static int frequencyElement(int[] arr, int n){
        int count=0;
       for(int i=0;i<arr.length;i++){
        if(arr[i]==n){
            count++;
        }
       }
       return count;
    }
      public static int frequencyElementHash(int[] arr, int n){

        HashMap<Integer , Integer> hm=new HashMap<>();
       for(int i=0;i<arr.length;i++){
        if(hm.containsKey(arr[i])){
            hm.put(arr[i], hm.get(arr[i]) + 1);
        }
        else{
            hm.put(arr[i], 1);
        
       }
    }
       return hm.get(n);
       
    }
    

    public static void main(String[] args) {
        int[] arr={1,2,3,2,3,2,3,4,2};
        int n=3;
        int frequency=frequencyElementHash(arr,n);
        System.out.println(frequency);
    }
    
}
