import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
        int n = kb.nextInt();
        int[] score=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            score[i]=kb.nextInt();
        }
        int max=score[0];
        int min=score[0];
        for(int i=1;i<n;i++){
            if(max<score[i]){
                max=score[i];
                count++;
            }if(min>score[i]){
                min=score[i];
                count++;
            }
        }    
        System.out.println(count);
        kb.close();
    }
}
