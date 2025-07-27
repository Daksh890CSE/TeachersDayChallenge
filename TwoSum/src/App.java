import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                int result = nums[i] + nums[j];
                if (result == target) {
                    return new int[] { i, j };
                }
            }
        }
        return nums;
    }
}

public class App {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = kb.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println("Enter target element");
        int targetValue = kb.nextInt();
        Solution obj = new Solution();
        int[] finalresult = obj.twoSum(arr, targetValue);
        System.out.println(Arrays.toString(finalresult));
    }

}
