import java.util.*;
public class largest_number {
    static int  get_largest_number(int numbers[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }

        }
        
        System.out.println("smallest numbers is "+smallest);
        return largest;

    }
    public static void main(String[] args) {
      int []numbers={2,8,10,3,6,9};
      int largest_number=get_largest_number(numbers);
      System.out.println("the largest number is:" +largest_number);
    }

    
}