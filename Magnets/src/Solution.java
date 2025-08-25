import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int group=1;
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=kb.nextLine();
        }
        for(int i=1;i<n;i++){
            if(arr[i-1]=="01" && arr[i]=="10" || arr[i-1]=="10" && arr[i]=="01"){
                group++;
            }
        }
    }
}
