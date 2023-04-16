public class arr21 {
    public static int buyAndSellingPrice(int[] price) {
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;

        for (int i=0;i<price.length;i++){
            if (buyPrice<price[i]){//price[i] means todays price. 7,1,5,3,6,4
                int prpfit=price[i]-buyPrice;//todays profit
                maxProfit=Math.max(maxProfit,prpfit);
            }else{
                buyPrice=price[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] price={7,1,5,3,6,4};
        System.out.println("maximum profit:"+buyAndSellingPrice(price));//maximum profit:5
    }
}
