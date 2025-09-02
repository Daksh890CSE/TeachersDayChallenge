import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int x=0;
        int y=0;
        int z=0;
        for(int i=0;i<n;i++){
            for(int j=1;j<4;i++){
                if(j==1){
                    x+=kb.nextInt();
                }else if(j==2){
                    y+=kb.nextInt();
                }else{
                    z+=kb.nextInt();
                }
            }
        }
        kb.close();
        if(x==0 & y==0 & z==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
