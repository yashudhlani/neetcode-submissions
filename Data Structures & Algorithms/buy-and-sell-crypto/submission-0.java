class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int minStock = prices[0];

        for (int price: prices) {
            max = Math.max(max, price - minStock);
            minStock = Math.min(price, minStock);
        }
        return max;
    }
}
