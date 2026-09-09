import java.util.*;

public class MaxMinDiffernceK {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Size of array and Value of K: ");
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements of Array :");
        for(int i=0;i<n;i++){
           arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        int maxdiff=Integer.MAX_VALUE;
        int mindif=0;
        int l=0,m=0;
        for(int i=0;i<=n-k;i++){
             mindif=arr[i+k-1]-arr[i];
            if(mindif<=maxdiff){
                maxdiff=mindif;
                l=i;
                m=i+k-1;

            }
        }
        int sum=0;
        for(int i=l;i<=m;i++){
            sum+=arr[i];
        }
        System.out.println("Minimum difference: " + maxdiff);
        System.out.println("Sum of selected elements: " + sum);
        sc.close();
    }
}
