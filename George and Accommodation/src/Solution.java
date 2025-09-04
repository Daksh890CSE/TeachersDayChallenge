import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            int people=kb.nextInt();
            int space=kb.nextInt();
            if(space-people>2){
                count++;
            }
        }
        kb.close();
        System.out.println(count);
    }
}
