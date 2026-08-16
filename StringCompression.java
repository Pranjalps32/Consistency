public class StringCompression {
     public static void main(String[] args) {
        String s1 = "aaabbbbccccdddddeaaaa";
        StringBuilder sb =new StringBuilder();
        int i=0;
        while(i<s1.length()){
            int count=0;
            for(int j=i;j<s1.length();j++){
                if(s1.charAt(i)==s1.charAt(j)){
                    count++;
                }
                else{
                    break;
                }
            }
                sb.append(s1.charAt(i));
                sb.append(count);
                i+= count;

        }
        System.out.println(sb);
    }
}
