import java.util.Arrays;
import java.util.HashMap;

public class TwoSumOptimized {
        public static int[] twoSum(int[] nums, int target) {

        int[] sum = new int[2];
        HashMap<Integer , Integer> hm=new HashMap<>();

        for(int i=0;i<nums.length;i++){

            int n=target-nums[i];
            if(hm.containsKey(n))
            {
               sum[0]=i;
               sum[1]=hm.get(n);
               return sum;
            }
            else{
                hm.put(nums[i],i);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr={2,4,5,6,7,3,2};
        int k=7;
        System.out.println(Arrays.toString(twoSum(arr, k)));
    }
}
