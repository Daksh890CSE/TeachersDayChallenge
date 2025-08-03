import java.util.*;

public class Solution {
    public int Team(int[] arr){
        int count=0;
        int solved=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count+=1;
                if(count>=2){
                    solved+=1;
                }
            }
        }
        return solved;
    }
    
    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
        Solution obj=new Solution();
        int n=kb.nextInt();
        for(int i=0;i<n;i++){
            String str=kb.nextLine();
            String[] numstr= str.split(" ");
            int[] num= new int[numstr.length]; 
            for(int j=0;j<numstr.length;j++){
                num[j]=Integer.parseInt(numstr[j]);
            }
        }
        System.out.println(obj.Team(num));
    }
}
