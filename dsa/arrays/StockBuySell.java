class StockBuySell{
    static int buyAndSell(int arr[]){
        int mini=arr[0];
        int maxProfit=0;
        for(int i=1;i<arr.length;i++){
            mini=Integer.min(mini,arr[i]);
            int cost=arr[i]-mini;
            maxProfit=Integer.max(cost,maxProfit);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        System.out.println(buyAndSell(arr));
    }
}