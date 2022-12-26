public class decimal_to_binary {
    public static void decimaltobinary(int num){
        int pow=0;
        int binum=0;
        int mynum=num;
        while(num>0){
           int reminder= num%2;
           binum=binum+(reminder*(int)Math.pow(10, pow));
           pow++;
          num= num/2;

        }
        System.out.println("the binary of "+mynum+" = "+binum);


    }
    public static void main(String[] args) {
        decimaltobinary(10);
    }
    
}
