import java.util.*;

public class Solution {
    public static long function(long n){
        long b=n-1;
        long sum;
        if(n%2==0){
            sum=n/2;
        }else{
            sum=b/2-n;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
        long n=kb.nextLong();
        kb.close();
        System.out.println(function(n));
    }
}
