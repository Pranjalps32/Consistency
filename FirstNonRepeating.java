import java.util.HashMap;

public class FirstNonRepeating {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm =new HashMap<>();
        int[] arr = {4, 5, 1, 2, 1, 4, 5};

        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i],1);
            }
        }

        for(int i=0;i<arr.length;i++){
            if(hm.get(arr[i])==1){
                  System.out.println(arr[i]);
            }
        }
    }
}
