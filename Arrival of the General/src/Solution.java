import java.util.*;

public class Solution {
    public static void swap(int a,int b){
        int c;
        c=a;
        a=b;
        b=c;

    }
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
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (min > arr[i]) {
                min = arr[i];
                min_index = i;
            } else if (max < arr[i]) {
                max = arr[i];
                max_index = i;
            }
        }
        for(int i=1;i<n;i++){
            int temp;
            if(arr[arr.length-1]!=min){
                if(arr[min_index]!=arr[min_index+1]){
                    temp=arr[i];
                    arr[i+1]=arr[i];
                    arr[i]=temp;
                    count++;
                    System.out.println(Arrays.toString(arr));
                }
            }if(arr[0]!=max){
                if(arr[max_index]!=arr[max_index-1]){
                    temp=arr[arr.length+i-2];
                    arr[arr.length+i-2]=arr[arr.length+i-1];
                    arr[arr.length+i-1]=temp;
                    count++;
                    System.out.println(Arrays.toString(arr));
                }
            }
        }
        System.out.println(count);
        
    }
}
