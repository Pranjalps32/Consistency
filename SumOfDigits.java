public class SumOfDigits {
    public static void main(String[] args) {
        int num=123456;
        int sum=0;
        while(num>0){
            int d=num%10;
            sum+=d;
            num/=10;
        }
        System.out.println(sum);
    }
    
}
