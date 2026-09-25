import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm =new HashMap<>();
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int n=arr.length;
        for(int i=0;i<n;i++){
           if(!hm.containsKey(arr[i])){
               hm.put(arr[i], 1);
           }
           else{
              hm.put(arr[i], hm.get(arr[i]) + 1);
           }
        }
         for(int i=0;i<n;i++){
            if(hm.get(arr[i])>n/2){
                System.out.println(arr[i]);
                break;
            }
         }
    }
    
}
