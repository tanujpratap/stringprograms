//package conditional_statements;
import java.util.Scanner;
public class students_marks_trnry_operator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
    String status=marks>=33 ? "pass" : "fail" ;
    System.out.println(status);       
    }
    
}
