import java.util.*;

class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<=1){
            return 0;
        }
        int min=prices[0];
        int profit=0;
        for(int i=0;i<prices.length;i++){
            if(min>prices[i]){
                min=prices[i];
            }else if(prices[i]-min>profit){
                profit=prices[i]-min;
            }
        }
        return profit;
    }

    public static void main(String args[]) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n = kb.nextInt();
        int[] prices = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            prices[i] = kb.nextInt();
        }
        Solution obj = new Solution();
        System.out.println(obj.maxProfit(prices));
        kb.close();
    }
}
