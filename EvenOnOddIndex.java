public class EvenOnOddIndex {
     public static void main(String[] args) {
        int[] arr ={45,23,33,34,25,24,45,27};

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0 && i%2!=0){
                System.out.println(arr[i]);
            }
        }
     }
    
}
