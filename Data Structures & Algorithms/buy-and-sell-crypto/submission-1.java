class Solution {
    public int maxProfit(int[] prices) {
        //left, right : both start at 0
        //if right < left -> left = right
        //if right > maior -> maior = right
        //return maior - left

        int left=0;
        int right = 0;
        int maior = -1;
        for (int i = 0; i < prices.length-1; i++){
            right++;
            int lucro = prices[right] - prices[left];
            if (lucro > maior){
                maior = lucro;
            }
            if(prices[right]< prices[left]){
                left = right;
            }
        }
        if (maior < 0){
            return 0;
        }else{
            return maior;
        }
    }
}
