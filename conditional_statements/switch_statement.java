//package conditional_statements;
import java.util.Scanner;
public class switch_statement {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int number=sc.nextInt();
        switch(number){
            case 1:
            System.out.println("samosa");
            break;
            case 2:
            System.out.println("burger");
            break;
            case 3:
            System.out.println("pizza");
            break;
            default:
            System.out.println("fast food");
        }
    }
    
}
