import java.util.Stack;

public class NextGreaterElementOPtimized {
    public static void main(String[] args) {
        int[] arr={4, 5, 2, 10, 8};
        Stack<Integer> st =new Stack<>();
        int[] result =new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                 result[i]=-1;
            }
            else{
                result[i]=st.peek();
            }
            st.push(arr[i]);
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        
    }
}
