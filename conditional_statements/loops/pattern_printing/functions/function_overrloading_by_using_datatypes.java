public class function_overrloading_by_using_datatypes {
    public static int sum(int a,int b){
        return a+b;
    }
    public static float sum(float a,float b){
        return  a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(2.7f, 4.7f));
        System.out.println(sum(2, 7));

       
    }
    
}
