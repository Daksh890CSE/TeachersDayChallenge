import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
        long n=kb.nextLong();
        String s=String.valueOf(n);
        kb.close();
        s=s.replaceAll("^[47]+$", "");
        if(s.isEmpty()){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
