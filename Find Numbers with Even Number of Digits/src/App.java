import java.util.*;

class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            String str=Integer.toString(nums[i]);
            int len=str.length();
            
        }
    }
}

public class App {
    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=kb.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++){
            nums[i]=kb.nextInt();
        }
        Solution obj=new Solution();
        int result=obj.findNumbers(nums);
        System.out.println(result);
    }
}
