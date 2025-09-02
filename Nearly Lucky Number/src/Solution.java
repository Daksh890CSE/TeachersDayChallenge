import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
        long n=kb.nextLong();
        kb.close();
        int count=0;
        while(n!=0){
            long a=n%10;
            if(a==7 || a==4){
                count++;
            }
            n/=10;
        }
        if(count==7 || count==4){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
