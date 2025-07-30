import java.util.*;

class Solution {
    public int maxProfit(int[] prices) {
        int len=prices.length;
        int purchase=prices[0];
        int sell=prices[len];
        for(int i=1;i<len;i++){
            if(prices[i-1]<prices[i]){
                if(purchase>=prices[i-1]){
                    purchase=prices[i-1];
                }else{
                    
                }
            }else{
                if(sell<prices[i])
            }
        }
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
    }
}
