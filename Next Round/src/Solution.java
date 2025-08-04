import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int count = 0;
        Scanner kb = new Scanner(System.in);
        String s = kb.nextLine();
        int[] arr1=new int[2];
        String[] str1=s.split(" ");
        for(int i=0;i<2;i++){
            try{
                arr1[i]=Integer.parseInt(str1[i]);
            }catch(Exception e){}
        }
        String s1 = kb.nextLine();
        int n = arr1[0];
        int k = arr1[1];
        int[] arr = new int[n];
        String[] str = s1.split(" ");
        for (int i = 0; i < n; i++) {
            try {
                arr[i] = Integer.parseInt(str[i]);
            } catch (Exception e) {
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (k >= arr.length) {
                count=k;
                break;
            } else if (arr[k] == 0) {
                break;
            } else if (arr[i] == arr[k]) {
                count += 1;
            } else if (arr[i] > arr[k]) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}
