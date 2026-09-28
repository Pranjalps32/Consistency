import java.util.Stack;
public class CharacterPair {
    public static void main(String[] args) {
        String s="aabbbcc";

        Stack<Character> st =new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(st.isEmpty()){
                st.push(c);
            }
            else if(st.peek()==c){
                st.pop();
            }
            else{
                st.push(c);
            }
        }
        if(st.isEmpty()){
            System.out.println("Every letter has pair");
        }
        else{
            System.out.println("Every element don't have pair" + st);
        }
    }
}
