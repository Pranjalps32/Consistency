import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRecurringCharacterQueue {
    public static void main(String[] args) {
        
        String s="aabbcdd";
        Queue<Character> Que =new LinkedList<>();
        int[] freq =new int[26];

        for(char ch :s.toCharArray()){
            Que.add(ch);
            freq[ch -'a']++;
        }
        while(!Que.isEmpty() && freq[Que.peek()- 'a']>1 ){
            Que.remove();
        }

        if(!Que.isEmpty()){
            System.out.println(Que.peek());
        }
        else{
            System.out.println(-1);
        }
            
        
    }
}
