public class DuplicatesInKDistance{
    public static void duplicates(int[] arr,int k){
        for(int i=0;i<arr.length;i++){
            for(int j = i + 1; j <= i + k && j < arr.length; j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i] + "  have an duplicate");
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr ={23,23,67,45,67,89,78,56,34};
        duplicates(arr, 4);
    }
}