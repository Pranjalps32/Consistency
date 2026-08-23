public class FactorialsRecursion {
    public static int factorials(int n){
        
        if(n==0 || n==1){
            return 1;
        }
        
         return n* factorials(n-1);
        
             
    }
    public static void main(String[] args) {
        int n=4;
        int q= factorials(n);
        System.out.println(q);
    }
}
