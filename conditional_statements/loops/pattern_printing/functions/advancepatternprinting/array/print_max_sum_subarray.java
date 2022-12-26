
public class print_max_sum_subarray {
    static void subarray(int numbers[]){
       int currentsum=0;
      int  maxsum=Integer.MIN_VALUE;
        
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                currentsum=0;

            
            for(int k=i;k<=j;k++){
currentsum=currentsum+numbers[k];
            }
            System.out.println("currsum is: "+currentsum);
if(maxsum<currentsum){
    maxsum=currentsum;
}



            }
            
            
            
          
        }
        System.out.println("maxsum"+maxsum);
    }

    public static void main(String[] args) {
        int []numbers={2,4,6,8,10};
subarray(numbers);

    }
    
}

