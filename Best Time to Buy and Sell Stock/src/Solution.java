import java.util.*;

class Solution {
    public int maxProfit(int[] prices) {
        int len=prices.length;
        int purchase=prices[0];
        int sell=prices[len];
        int day=len;
        for(int i=1;i<len;i++){
            if(prices[i-1]<prices[i]){
                if(purchase<=prices[i-1]){
                    purchase=prices[0];
                }else{
                    purchase=prices[i-1];
                }
            }else{
                if(sell<prices[i-1]){
                    sell=prices[i-1];
                    day=i-1;
                }else{
                    sell=prices[len];
                }
            }if(sell==purchase){
                return day=0;
            }
        }
        return day;
    }
    public static void main(String args[]){
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n=kb.nextInt();
        int[] prices=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            prices[i]=kb.nextInt();
        }
        Solution obj=new Solution();
        System.out.println(obj.maxProfit(prices));
    }
}
