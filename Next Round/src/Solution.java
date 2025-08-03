import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
        String s=kb.nextLine();
        String s1=kb.nextLine();
        int n=(s.charAt(0))-'0';
        int k=(s.charAt(2))-'0';
        int[] arr=new int[n];
        String[] str=s1.split(" ");
        for(int i=0;i<n;i++){
            try{
                arr[i]=Integer.parseInt(str[i]);
            }catch(Exception e){}
        }
    }
}
