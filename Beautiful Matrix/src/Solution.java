import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
        int[] arr=new int[5];
        int row=0;
        int column=0;
        for(int i=0;i<5;i++){
            arr[i]=kb.nextInt();
            if(arr[i]==1){
                column=i;
                break;
            }else if(i==4 && arr[4]!=1){
                row+=1;
                i=-1;
            }
        }
        System.out.println(row);
        System.out.println(column);
    } 
}
