public class LongestPalindrome {
    public static boolean palindrome(String s1){
        StringBuilder sb =new StringBuilder(s1);
        if (sb.toString().equals(sb.reverse().toString())){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s1="babad";
        String longest="";
        for(int i=0;i<s1.length();i++){
            for(int j=i+1;j<=s1.length();j++){
                String sub =s1.substring(i, j);
                if(palindrome(sub))
                   {
                     if(longest.length()<sub.length())
                     {
                        longest=sub;
                     }
                   }
            }
        }
        System.out.println(longest);
    }
    
}
