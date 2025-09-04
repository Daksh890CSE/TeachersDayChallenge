import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        int min_index = 0;
        int max_index = 0;
        int swap;
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (min >= arr[i]) {
                min = arr[i];
                min_index = i;
            } else if (max < arr[i]) {
                max = arr[i];
                max_index = i;
            }
        }
        swap=max_index+(n-1-min_index);
        if(max_index>min_index){
            swap--;
        }
        System.out.println(swap);
    }
}
