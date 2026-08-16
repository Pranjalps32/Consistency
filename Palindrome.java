public class Palindrome {

    public static void main(String[] args) {
        String s="madam";
        StringBuilder sb =new StringBuilder();
        int n=s.length();
        for(int i=n-1;i>=0;i--){
            char ch=s.charAt(i);
            sb.append(ch);
        }
        if(s.equals(sb.toString())){
            System.out.println("String is Palindrome");
        }
        else{
             System.out.println("String is not Palindrome");
        }

    }
    
}
