import java.util.Scanner;
public class tut_02continue_statement {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        do{
        int n=sc.nextInt();
        if(n%10==0){
            continue;
        }
            System.out.println(n);}while(true);
        
        }
  
    }
    

