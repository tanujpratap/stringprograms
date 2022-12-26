//package 2-D_Arrays;

public class spiral_matrix {
    static void print_spiral_matrix(int matrix[][]){
        int start_row=0;
       int start_col=0;
        int end_row=matrix.length-1;
        int end_col=matrix[0].length-1;
        while(start_row<=end_row&&start_col<=end_col){
            for(int j=start_col;j<=end_col;j++){
                System.out.print(matrix[start_row][j]+" ");
            }
            for(int i=start_row+1;i<=end_row;i++){
                System.out.print(matrix[i][end_col]+" ");
            }
            for(int j=end_col-1;j>=start_col;j--){
                if(start_row==end_row){
                    break;
                }
                System.out.print(matrix[end_row][j]+" ");

            }
            for(int i=end_row-1;i>=start_row;i--){
                if(start_col==end_col){
                    break;
                }
                System.out.print(matrix[i][start_col]+" ");
            }
            start_row++;
            end_row--;
            start_col++;
            end_row--;
        }
System.out.println();

    }
    public static void main(String[] args) {
       
        int [][]matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}}; 
        print_spiral_matrix(matrix);
    }

}
