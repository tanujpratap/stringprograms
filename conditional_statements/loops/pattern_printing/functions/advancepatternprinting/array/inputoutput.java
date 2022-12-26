//package array;
import java.util.Scanner;
public class inputoutput {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int []arr=new int [40];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.println("length of the array"+arr[i]);
        }
    }
    
}
