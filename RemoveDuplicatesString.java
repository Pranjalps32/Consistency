public class RemoveDuplicatesString {
    public static void main(String[] args) {
        String s1="Programming";
        StringBuilder sb =new StringBuilder();
        for(int i=0;i<s1.length();i++){
            if(sb.toString().contains(String.valueOf(s1.charAt(i)))){
                continue;
            }
            else{
                sb.append(s1.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
    
}
