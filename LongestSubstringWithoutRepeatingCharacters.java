public class LongestSubstringWithoutRepeatingCharacters {
    public static boolean checkduplicates(String s){
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            for(int j=i+1;j<s.length();j++){
                if(c==(s.charAt(j)))
                {
                    return false;
                }
            }
        }
        return true;

    }
    public static void main(String[] args) {
        String s="abcabcbb";
        //StringBuilder sb=new StringBuilder();
        String longest="";

        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                  String sub=s.substring(i, j);
                  if(checkduplicates(sub)){
                    if(longest.length()<sub.length()){
                        longest=sub;
                    }
                  }
                  
            }
        }
        System.out.println(longest);

        
    }
    
}
