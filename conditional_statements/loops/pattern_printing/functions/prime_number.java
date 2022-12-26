public class prime_number {
   
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
    public static void main(String[] args) {
        System.out.println(is_prime(2));
        
    }
    
}
