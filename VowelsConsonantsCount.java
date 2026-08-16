public class VowelsConsonantsCount {
    public static void main(String[] args) {
        String s="palindrome";
        int v=0;
        int c=0;
       
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetter(ch)){
                  if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                       v+=1;
                    }
                  else{
                      c+=1;
                    }
                }
             }
        System.out.println("Total vowels in String are:"+ v);
        System.out.println("Total consonants in String are:"+ c);
        

    }
    
}
