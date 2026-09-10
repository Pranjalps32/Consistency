//import java.util.HashMap;
import java.util.HashSet;

public class FirstDuplicate {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        int[] arr = {1, 2, 3, 1, 2, 4, 5};
        for(int i=0;i<arr.length;i++){
            if(hs.contains(arr[i]))
            {
                System.out.println(arr[i]);
                return;
            }
            else{
                hs.add(arr[i]);
            }
        }
    }
}
