public class linear_search_string {
    static int linear_search(String menu[], String item){
        for(int i=0;i<menu.length;i++){
            if(menu[i]==item){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String []menu={"dosa","burger","pizza","samosa","cake","pasta","petiz"};
        String item="samosa";
        int index =linear_search(menu, item);
        if(index==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("found at index :"+index);
        }

    }
    
}
