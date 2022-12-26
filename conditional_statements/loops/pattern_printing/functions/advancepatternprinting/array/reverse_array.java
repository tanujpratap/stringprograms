public class reverse_array {
    static void get_reversed_array(int numbers[]){
        int first=0;
        int last=numbers.length-1;
while(first<last){
    int temp=numbers[last];
    numbers[last]=numbers[first];
    numbers[first]=temp;
    first++;
    last--;
    

}
    }
    public static void main(String[] args) {
        int []numbers={2,4,6,8,10};
      get_reversed_array(numbers);
      for(int i=0;i<numbers.length;i++){
        System.out.print("the reversed array is"+numbers[i]);
        System.out.println();
      }

    }
}
