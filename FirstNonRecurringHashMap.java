import java.util.HashMap;

public class FirstNonRecurringHashMap {
    public static void main(String[] args) {
        HashMap<Character , Integer> hm =new HashMap<>();
        String s="swiss";
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
            }
            else{
                hm.put(s.charAt(i), 1);
            }
        }
        for(int i = 0; i < s.length(); i++) {
    
                  if(hm.get(s.charAt(i)) == 1) {
                      System.out.println(s.charAt(i));
                      break;
                    }
            } 
    }
    
}
