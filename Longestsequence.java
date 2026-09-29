
import java.util.HashSet;
public class Longestsequence {
    public static void main(String[] args) {
        int[] arr={9,1,4,7,3,2,6,5};
        HashSet<Integer> set =new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        int longest=0;
        for(int num :set){
            if(!set.contains(num-1)){
                int current = num;
                int length=1;

                while(set.contains(current+1)){
                    current++;
                    length++;

                }
                longest =Math.max(length, longest);
            }
        }
        System.out.println(longest);
    }
}
