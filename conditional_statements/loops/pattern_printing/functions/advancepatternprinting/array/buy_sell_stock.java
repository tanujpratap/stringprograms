import java.util.Scanner;
public class buy_sell_stock {
    static int get_profit_in_stock(int prices[]){
int buyingprice=Integer.MAX_VALUE;
int maxprofit=0;
for(int i=0;i<prices.length;i++){
    if(buyingprice<prices[i]){
        int profit=prices[i]-buyingprice;
        maxprofit=Math.max(maxprofit,profit);
    }
    else{
        buyingprice=prices[i];
    }
}
return maxprofit;
    }
    public static void main(String[] args) {
        int []prices={7,1,5,3,6,4};
        System.out.println(get_profit_in_stock(prices));
    }
    
}
