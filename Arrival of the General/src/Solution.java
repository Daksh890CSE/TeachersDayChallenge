import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        int min_index = 0;
        int max_index = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        kb.close();
        int max = arr[0];
        int min = arr[0];
        int temp;
        while (min_index != arr.length - 1 || max_index != 0) {
            for (int i = 0; i < n; i++) {
                if (min >= arr[i]) {
                    min = arr[i];
                    min_index = i;
                } else if (max <= arr[i]) {
                    max = arr[i];
                    max_index = i;
                }
            }
            if (min_index != arr.length - 1) {
                temp = arr[min_index + 1];
                arr[min_index + 1] = arr[min_index];
                arr[min_index] = temp;
                count++;
            } else if (max_index != 0) {
                temp = arr[max_index - 1];
                arr[max_index - 1] = arr[max_index];
                arr[max_index] = temp;
                count++;
            }
        }
        System.out.println(count);
    }
}
