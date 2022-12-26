public class print_prime_numbers {
    public static boolean is_prime(int n){
        if(n==2){
            return true;
        }
      //  for (int i=2;i<=n-1;i++){
        //new approach
            for (int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }

        }
        return true;
    }
    public static void printprimenumbers(int n){
        for(int i=2;i<=n;i++){
          if( is_prime(i)){
            System.out.print(i+" ");
          }
        }
        System.out.println();
       
    }
    public static void main(String[] args) {
        printprimenumbers(234
        );
    }
    
}
