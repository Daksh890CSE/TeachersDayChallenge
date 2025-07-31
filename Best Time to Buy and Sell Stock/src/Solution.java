import java.util.*;

class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int purchase = prices[0];
        int sell = prices[len - 1];
        int purchase_day = 1;
        int sell_day = len - 1;
        if(len==1){
            sell_day=0;
        }else if(len==2 && purchase==sell){
            sell_day=0;
        }else if(len==2 && purchase<sell){
            sell_day=2;
        }else if(len==2 && purchase>sell){
            sell_day=0;
        }
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
