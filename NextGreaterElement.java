import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        
        int[] arr={4, 5, 2, 10, 8};
        Stack<Integer> st = new Stack<>();
        

        for(int i=0;i<arr.length;i++){
            boolean found=false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    st.push(arr[j]);
                    found=true;
                    break;
                }
            }
                if(found==false){
                    st.push(-1);
                }

            
        }
       
        System.out.println(st);
    }
}
