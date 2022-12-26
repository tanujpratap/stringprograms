public class butterflypatternprinting {
    public static void printbutterflypattern(int n){
        for(int i=0;i<=n;i++){
            for(int j=i;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        printbutterflypattern(4);
        
    }
    
}
