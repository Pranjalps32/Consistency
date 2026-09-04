public class PrintN {

    public static void print(int n)
    {
        System.out.println(n);
        if(n<10){
           print(n+1);
        }
    }
    public static void main(String[] args) {
        int n=1;
        print(n);
    }
}
