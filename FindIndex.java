class FindIndex {
    public static int searchInsert(int[] nums, int target) {
        
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]>=target)
            {
                return i;
            }
            else if(nums[i]<target && i==nums.length-1){
                return i+1;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int[] arr ={1,3,4,5,6,7};
        int index =searchInsert(arr, 2);
         System.out.println(index);
    }
}