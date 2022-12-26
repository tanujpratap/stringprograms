public class method_overloading {
      //sum of two numbers
      public static int sum(int a ,int b ){
        return a+b;
      }
      //sum of three  numbers
      public static int sum(int a, int b,int c){
        return a+b+c;
      }
    public static void main(String[] args) {
    System.out.println(sum(12,34 ));
    System.out.println(sum(12, 23, 34));
      
    }
    
}
