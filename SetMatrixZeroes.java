public class SetMatrixZeroes {
    public static void setZero(int[][] arr){
        int[] row =new int[arr.length];
        int[] column=new int[arr[0].length];
          for(int i=0;i<arr.length;i++){
              for(int j=0;j<arr[i].length;j++){
                 if(arr[i][j]==0){
                      row[i]=1;
                      column[j]=1;
                    }
                }
            }

           for(int i=0;i<arr.length;i++){
              for(int j=0;j<arr[i].length;j++){
                  if(row[i]==1||column[j]==1){
                       arr[i][j]=0;
                    }
                 }
              }

    }
    public static void printArray(int[][] arr) {
        for(int i=0;i<arr.length;i++){
              for(int j=0;j<arr[i].length;j++){
                 System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
    }
    public static void main(String[] args) {
        
    
        int[][] arr = {{1, 2, 3},{3, 0, 5},{6, 7, 8}};
        printArray(arr);
        setZero(arr);
        System.out.println("Printing after setting Zeroes.....");
        printArray(arr);

    }
    
}
