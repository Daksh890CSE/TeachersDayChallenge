import java.util.*;

class Solution {
    public int maxProfit(int[] prices) {
       int profit;
       int nxt_profit;
       int len=prices.length;
       int max;
       int day=0;
       if(len==1){
        day=0;
       }if(len==2 && prices[0]==prices[1]){
        day=0;
       }for(int i=2;i<len;i++){
        profit=prices[i-1]-prices[i-2];
        nxt_profit=prices[i]-prices[i-1];
        max=profit;
        if(profit>0){
            day=i+1;
        }
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
