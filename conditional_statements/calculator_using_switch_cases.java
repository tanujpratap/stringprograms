//package conditional_statements;
import java.util.Scanner;
public class calculator_using_switch_cases {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a :");
        int a=sc.nextInt();
        System.out.println("enter b :");
        int b=sc.nextInt();
        System.out.println("enter operator :");
        char operator=sc.next().charAt(0);
        switch(operator){
            case '+':
            System.out.println(a+b);
            break;
            case '-':
            System.out.println(a-b);
            break;
            case '*':
            System.out.println(a*b);
            break;
            case '/':
            System.out.println(a/b);
            break;
            case '%':
            System.out.println(a%b);
            break;
            default:
            System.out.println("my calculator is not that advance");
            

        }

        
    }
    
}
