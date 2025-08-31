import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
        int n = kb.nextInt();
        int[] score=new int[n];
        int max=-1;
        int count=1;
        for(int i=0;i<n;i++){
            score[i]=kb.nextInt();
        }
        for(int i=1;i<n;i++){
            if(score[i-1]<score[i]){
                if(max<score[i]){
                    max=score[i];
                    count++;
                }
            }
        }System.out.println(count);
        kb.close();
    }
}
