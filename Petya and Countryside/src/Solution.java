import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        int max_count = -1;
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        kb.close();
        for (int i = 0; i < n; i++) {
            int min = 1001;
            int count = 0;
            for (int j = i+1; j < n; j++) {
                if (arr[j] <= min) {
                    min = arr[j];
                    count++;
                    if (count > max_count) {
                        max_count = count;
                    }
                } else {
                    break;
                }
            }for(int k=i;k>=0;k--){
                if (arr[k] <= min) {
                    min = arr[k];
                    count++;
                    if (count > max_count) {
                        max_count = count;
                    }
                } else {
                    break;
                }
            }
        }
        System.out.println(max_count);
    }
}
