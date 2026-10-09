public class Leetcode2 {
    

    public static  boolean isPalindrome(int x) {
             int original=x;
             int rev=0;
             if(x<0){
                return false;
             }
             while(x!=0){
                int num= x%10;
                rev=rev*10+num;
                x=x/10;
             }

             if(original==rev){
                return true;
             }
             return false;
        
    }
    public static void main(String[] args) {
        int num = 121;
        boolean ans =isPalindrome(num);
        if(ans==true){
            System.out.println("Its palindrome");
        }
        else{
            System.out.println("Its not palindrome");
        }
    }
}