
import java.util.HashSet;

public class DistinctSubstring {

    static HashSet<String> set=new HashSet<>();
    public static void generate(String s, int index, String current){
        if(index==s.length()){
            set.add(current);
            return;
        }

        generate(s, index+1, current);
        generate(s, index+1, current+s.charAt(index));
    }
    public static void main(String[] args) {
        String s="aba";
        generate(s, 0, "");
        set.remove("");
        System.out.println(set);
        System.out.println(set.size());
       
    }
}
