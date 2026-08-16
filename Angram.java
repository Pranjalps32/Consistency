import java.util.Arrays;
public class Angram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        char[] ch1 =s1.toCharArray();
        char[] ch2 =s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(ch1.length==ch2.length && Arrays.equals(ch1, ch2))
            {
                System.out.println(s1 +" " + s2 +" They are anagrams");
            }
        else{
             System.out.println(s1 +" " + s2 + " They are not angrams");   
            }
        
    }
    
}
