import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        int count=0;
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
            sum+=arr[i];
        }
        kb.close();
        for(int i=0,temp=0;temp<=(sum/2);i++){
            temp+=arr[i];
            count+=1;
        }
        System.out.println(count);
    }
}
