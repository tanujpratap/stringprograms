//package advancepatternprinting;

public class hollow_rectangle {
    public static void hollowrectangle(int totrows,int totcolms){
        for(int i=1;i<=totrows;i++){
            for(int j=1;j<=totcolms;j++){
                if(i==1||i==totrows||j==1||j==totcolms){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        hollowrectangle(4, 5);
        
    }
    
}
