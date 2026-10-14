public class LeetCode4 {
     public static void moveZeroes(int[] nums) {

        int[] arr = new int[nums.length];
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                 arr[index++]=nums[i];
            }
        }
        while(index<nums.length){
            arr[index++]=0;
        }

        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }
        
    }
    public static void main(String[] args) {
        int[] arr={1,0,9,0,45,67,0,33};
        moveZeroes(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
