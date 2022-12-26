public class floyds_triangle {
    public static void printfloydtriangle(int n){
        int counter=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
          //  for(int j=1;j<=i;j++){
          //      System.out.print(" ");
          //  }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        printfloydtriangle(5);
        
    }
    
}
