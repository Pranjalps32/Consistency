import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class HelpAlex{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int[] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
          Arrays.sort(arr);
         Stack<Integer> st =new Stack<>();
         for(int i=n-1;i>=0;i--){
            st.push(arr[i]);
         }

         while(!st.isEmpty() && st.size()>1){
            st.pop();
            st.pop();
         }
         if(st.size()==1){
            System.out.println(st.peek());
         }
    }
}