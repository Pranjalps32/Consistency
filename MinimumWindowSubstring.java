public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String s="AABC";
        s=s.toLowerCase();
        //StringBuilder sb=new StringBuilder();
        String shortest="";

        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                  String sub=s.substring(i, j);
                   if(sub.contains("a")&&sub.contains("b")&& sub.contains("c")){
                          
                        if(shortest.equals("") || sub.length() < shortest.length())
                            {
                             shortest = sub;
                            }
                   }

                  
            }
        }
        System.out.println(shortest);
}
}
