public class StringPair {
    public static void main(String[] args) {
        String s="parllelogram";
        int n=3;
        int count=0;
        System.out.print("[ ");
        for(int i=0;i<=s.length()-n;i++){
            String a=s.substring(i, i+n);
            
            System.out.print(a+ " ");
           
            count++;
    
        }
         System.out.print("  ]");
         System.out.println();
         System.out.println(count);
    }
    
}
