import java.util.*;

public class Solution {
   public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int count=0;
        int solved =0;
        for(int i=0;i<n;i++){
            String str=kb.nextLine();
            String[] numstr= str.split(" ");
            int[] num= new int[numstr.length]; 
            for(int j=0;j<numstr.length;j++){
                num[j]=Integer.parseInt(numstr[j]);
            }
        }
    }
}
