//package 2-D_Arrays;
import java.util.Scanner;
public class _2D_Array_printing {
    static boolean search_key(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
        if(matrix[i][j]==key){
           
            System.out.println("element present at ("+i+","+j+")");
            return true;
        }
    }}
  
    System.out.println("not found");
    return false;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=3,m=3;
        int matrix[][]=new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
            
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
search_key(matrix, 5);
    }

    }
    

