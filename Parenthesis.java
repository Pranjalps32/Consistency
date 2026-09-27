import java.util.Stack;

public class Parenthesis {
    public static void main(String[] args) {
        Stack<Character> st =new Stack<>();
        String s="{[]}()";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '{' || c == '[' || c == '(' ){
                st.push(c);
            }
            else if(!st.isEmpty() && c=='}' && st.peek() =='{' || c==']' && st.peek()=='[' || c==')'&& st.peek()=='(')
               {
                st.pop();
               }
            else {
                System.out.println("Parenthesis is not balanced");
                return;
            }
        }
            if(st.isEmpty()){
                System.out.println("Parenthesis is balanced");
            }
            else{
                System.out.println("Parenthesis is not balanced");
            }
        
    }

}