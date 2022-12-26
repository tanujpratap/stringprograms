//package functions;

public class binomial_cofficient {
    public static int calculate_factorial(int n){
        int sum=1;
        for(int i=n;i>0;i--){
            sum=sum*i;
            
        }
        return sum;
    }
    public static int calculate_binomial_cofficient(int n,int r){
      int  factorial_n=calculate_factorial(n);
      int factorial_r=calculate_factorial(r);
       int factorial_nm=calculate_factorial(n-r);
       int binomial_cofficient=factorial_n/(factorial_r*factorial_nm);
       return binomial_cofficient;
    }
    public static void main(String[] args) {
        
        System.out.println(calculate_binomial_cofficient(5, 2));
        
    }
    
}
