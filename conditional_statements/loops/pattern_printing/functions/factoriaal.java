//package functions;
import java.util.Scanner;
public class factoriaal {
    public static int calculate_factorial(int n){
        int sum=1;
        for(int i=n;i>0;i--){
            sum=sum*i;
            
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int factoriaal=calculate_factorial(n);
    System.out.println(factoriaal);
        
    }
    
}
