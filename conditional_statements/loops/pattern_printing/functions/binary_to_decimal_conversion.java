public class binary_to_decimal_conversion {
    public static void binarytodecimal(int binum){
        int mynum=binum;
        int pow=0;
        int decimal=0;
        while(binum>0){
            int last_digit=binum%10;
            decimal=decimal+(last_digit*(int)Math.pow(2, pow));
            pow++;
            binum=binum/10;
          
        }
        System.out.println("the decimal of" + mynum + " = "+decimal);
    }
    public static void main(String[] args) {
        binarytodecimal(1000001);
        
        
    }
    
}
