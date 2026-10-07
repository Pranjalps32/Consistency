import java.util.Stack;
class Leetcode1 {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<> ();

        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(ch=='[' ||ch == '{' || ch=='('){
                st.push(ch);
            }
            else if(!st.isEmpty())
                {
                    if(ch==']' && st.peek()=='['||ch==')' && st.peek()=='('||ch=='}' && st.peek()=='{'){
                    st.pop();
                } 
                 else{
                     return false;
                } 
                }
             else{
                     return false;
                } 
                     
        }
        if(st.isEmpty())
        {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        String s="(])";
        Leetcode1 obj = new Leetcode1();
        if(true==obj.isValid(s)){
            System.out.println("Valid parenthesis");
        }
        else{
            System.out.println("Invalid Parenthesis");
        }
    }
}