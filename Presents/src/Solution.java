import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int[] present=new int[n];
        int[] fnl=new int[n];
        for(int i=0;i<n;i++){
            present[i]=kb.nextInt();
        }
        for(int i=0;i<n;i++){
            fnl[present[i]-1]=i+1;
        }
        System.out.println(Arrays.toString(fnl));
    }
}
