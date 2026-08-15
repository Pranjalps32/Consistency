public class PrintAlternate {
    public static void main(String[] args) {
        int[] arr ={34,56,23,78,46,67,89,23,14};
        System.out.println("Printing Array:");
        System.out.print("[ ");
        for(int i=0;i<arr.length;i++){
           
                System.out.print( arr[i] +" " );
            
        }
        System.out.print(" ]\n");
        System.out.println("Printing Alternates:");
        System.out.print("[ ");
        for(int i=0;i<arr.length;i +=2){
            
                System.out.print( arr[i] +" " );
            
        }
        System.out.print(" ]");
    }
    
}
