class Leetcode3 {
    public static int removeDuplicates(int[] nums) {
        int [] arr =new int[nums.length];
        int index=0;
        arr[index++]=nums[0];
        if (nums.length==0){
            return 0;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
               arr[index]=nums[i];
               index++;
            }
        }
        for(int i=0;i<index;i++){
            nums[i]=arr[i];
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,4,4,5,5,6};
        int n=removeDuplicates(arr);
        System.out.println(n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}