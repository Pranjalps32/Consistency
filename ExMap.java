import java.util.HashMap;
import java.util.Map;

public class ExMap {
 

    
    public static void main(String[] args){
        
        
        Map<String, Integer> m = new HashMap<>();

        
        m.put("abc", 1);
        m.put("pqr", 2);
        m.put("xyz", 3);

        System.out.println("Map elements: " + m);
    }
}

