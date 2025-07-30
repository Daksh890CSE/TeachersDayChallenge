import java.util.*;

class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int purchase = prices[0];
        int sell = prices[len - 1];
        int purchase_day = 1;
        int sell_day = len - 1;
        for (int i = 1; i < len; i++) {
            if (prices[i - 1] < prices[i]) {
                if (purchase >= prices[i - 1]) {
                    purchase = prices[i - 1];
                    purchase_day = i + 1;
                }
            } else if (purchase == prices[0]) {
                if (prices[i - 1] > prices[i]) {
                    purchase_day = len;
                } else {
                    purchase_day=1;
                }
            }
        }
        if (purchase_day < len) {
            for (int j = purchase_day; j < len; j++) {
                if (sell < prices[j]) {
                    sell = prices[j];
                    sell_day = j + 1;
                }
            }
        } else {
            sell_day = 0;
        }
        return sell_day;
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
