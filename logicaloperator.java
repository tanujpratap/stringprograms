public class logicaloperator {
    public static void main(String[] args) {
    //  logical And 
        System.out.println((3>2)&&(4>2));//--->return true
      System.out.println((3<2)&&(4>2));//--->return false
      System.out.println((4>2)&&(3<2));//return ---->false
      System.out.println((4<2)&&(3<2));//return---> false
     // logical or operator
      System.out.println((3>2)||(4>2));//--->return true
      System.out.println((3<2)||(4>2));//--->return true
      System.out.println((4>2)||(3<2));//return ---->true
      System.out.println((4<2)||(3<2));//return---> false

      //logical not
      System.out.println(!(2>3));//return---->false
      System.out.println(!(3>2));//return --->true
    }}
  
    

