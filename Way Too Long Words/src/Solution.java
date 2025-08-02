import java.util.*;

public class Solution {
    public String WayTwoLong(String s){
        int len=s.length();
        if(len<9){
            return s;
        }else{
            char start=s.charAt(0);
            char end=s.charAt(len-1);
            int num=len-2;
            s=String.valueOf(start)+num+String.valueOf(end);
        }
        return s;
    }
    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
        Solution obj=new Solution();
        int n=kb.nextInt();
        for(int i=0;i<n;i++){
            System.out.println(obj.WayTwoLong(kb.next()));
        } 
        kb.close();
    }
}
