public class ReverseString {
    public static void reverseStringUsingStringBuilder(String s){
        int n=s.length();
        StringBuilder sb =new StringBuilder();
        for(int i=n-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            sb.append(ch);

         }
         System.out.println(sb);
    }
    public static void reverseStringCharArray(String s){
        char[] charArray =s.toCharArray();
        int right=charArray.length-1;
        int left=0;
        while(left<right){
            char temp =charArray[left];
            charArray[left]=charArray[right];
            charArray[right]=temp;
            left++;
            right--;
        }
        System.out.println(charArray);
    }
    public static void main(String[] args) {
       
       String s="ABCDEF";
       reverseStringUsingStringBuilder(s);
       reverseStringCharArray(s);
       
  }
}
