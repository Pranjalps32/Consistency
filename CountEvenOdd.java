public class CountEvenOdd{
    public static void main(String[] args){
        int n=123456789;
        int even=0, odd=0;
        while(n>0){
            int d=n%10;
            if(d%2==0){
                even++;
            }
            else{
                odd++;
            }
            n/=10;
        }
        System.out.println("Even : "+even +"\nOdd : "+odd);
    }

}