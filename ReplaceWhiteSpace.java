public class ReplaceWhiteSpace {
    public static void main(String[] args) {
        String s="a b c d e f";
        s=s.replaceAll("\\s+", "");
        System.out.println(s);
        
    }
    
}
