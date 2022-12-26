public class binary_search_in_array {
    static int binary_search(int numbers[],int key){
      int  start=0;
      int  end=numbers.length-1;
      int mid=(start+end)/2;
        while(start<=end){
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){//right
                start=mid+1;
                
            }
            else{//left
                end=mid-1;
            }

        }
        return -1;
    }
    

public static void main(String[] args) {
    int []numbers={2,4,6,7,8,10,12,16,18,20};
    int key=8;
    System.out.println("index for key is:"+binary_search(numbers, key));
}
}
