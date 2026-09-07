public class Ntriangle {
    public static void main(String[]  args){
              int n=9;
              int completeHeight=0;
              int incompleteHeight=0;
              int remainingStars=n;
            for(int i=1;remainingStars>0;i++){
                int starinrow=Math.min(i,remainingStars);
                for(int j=1;j<=starinrow;j++){
                    System.out.print(" * ");  
                }
                remainingStars-=starinrow;
                System.out.println();

                if(i==starinrow){
                        completeHeight=i;
                     }
                    else{
                        completeHeight=i-1;
                        incompleteHeight=i;
                    }
            }
            System.out.println("CompleteHeight= "+completeHeight);
            System.out.println("IncompleteHeight= "+incompleteHeight);
    }
    
}
