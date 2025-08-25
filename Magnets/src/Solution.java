import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        kb.nextLine();
        int group=1;
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=kb.nextLine();
        }
        kb.close();
        for(int i=1;i<n;i++){
            if(arr[i-1].equals("01") && arr[i].equals("10") || arr[i-1].equals("10") && arr[i].equals("01")){
                group++;
            }
        }
        System.out.println(group);
    }
}
