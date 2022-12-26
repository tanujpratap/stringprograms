//package conditional_statements;
import java.util.Scanner;
public class incometaxcalculator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int income=sc.nextInt();
        int tax;

        if(income<500000){
            tax=income*0/100;
            System.out.println(tax);

        }
        else if((income>=500000)&&(income<=1000000)){
            tax=income*20/100;
            System.out.println(tax);
        }
        else{
            tax=income*30/100;
            System.out.println(tax);
        }
        
    }
    
}
