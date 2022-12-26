import java.util.Arrays;
public class insertion_sort {
    static void insertionsort(int arr[]){
        for(int i=1;i<arr.length ;i++){
int curr=arr[i];
int prev=i-1;
//finding out the correct position of insert
           while(prev>=0&&arr[prev]>curr) {
            arr[prev+1]=arr[prev];
            prev--;
           

           }

 //insertion
 arr[prev+1]=curr;
            
        }


    }
    static void get_sorted_array(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int []arr={5,4,1,3,2};
      //  insertionsort(arr);
      //  get_sorted_array(arr);
      Arrays.sort(arr);
        System.out.println(arr);
    }
    
}
