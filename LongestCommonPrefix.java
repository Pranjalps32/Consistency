public class LongestCommonPrefix {
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder();
        String[] s={"flo","flower","flowing","floor","flowy","flop"};
        int shortest=s[0].length();
        for(int i=0;i<s.length;i++){
            if(shortest>s[i].length()){
                shortest=s[i].length();
            }
        }
        for(int i=0;i<shortest;i++){
            char ch =s[0].charAt(i);
            for(int j=0;j<s.length;j++){
                if(ch!=s[j].charAt(i))
                {
                   return;
                }
                
            }
            sb.append(ch);
        }
        System.out.println(sb);

    }
    
}
