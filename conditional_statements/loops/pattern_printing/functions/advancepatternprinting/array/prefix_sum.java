public class prefix_sum {
    


    static void subarray(int numbers[]){
       int currentsum=0;
      int  maxsum=Integer.MIN_VALUE;
      int []prefix=new int [numbers.length];
      prefix[0]=numbers[0];
      for(int i=1;i<prefix.length;i++){
        prefix[i]=prefix[i-1]+numbers[i];
        
      }
        
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                currentsum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1]; 

          
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

